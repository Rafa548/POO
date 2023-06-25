package Aula11.Ex2;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex2 {
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<String>> listaVoos = new ArrayList<>(); // Lista das informações de cada voo para colocar
																	// num objeto
		List<String> linhas = Files.readAllLines(Paths.get("voos.txt")); // Lista de linhas do ficheiro voos.txt //slide 08-13

		for (int i = 1; i < linhas.size(); i++) {
			ArrayList<String> lista2 = new ArrayList<>(); // lista de informações de uma linha
			String[] params = linhas.get(i).split("\t");
			for (String p : params) {
				lista2.add(p);
			}
			if (params.length < 4) {
				lista2.add("00:00"); // todos terem atrasos
			}
			listaVoos.add(lista2);
		}

		HashMap<String, String> mapa_C = new HashMap<>();
		linhas = Files.readAllLines(Paths.get("companhias.txt"));

		for (int i = 0; i < linhas.size(); i++) {
			String[] params = linhas.get(i).split("\t");
			mapa_C.put(params[0], params[1]); // siglas keys, nomes values
		}

		ArrayList<voos> l_voos = new ArrayList<>();
		for (ArrayList<String> voo : listaVoos) {
			String comp = mapa_C.get(voo.get(1).substring(0, 2)); // voo é do tipo (Hora ,Voo ,Companhia ,Origem
																																		// ,Atraso) logo (voo[1] = Voo )
			l_voos.add(new voos(new Tempo(voo.get(0)), 			// e substring (0,2) caracter 0 até ao 1 ou seja a sigla no
																		// dicionário obtem-se o value que é o nome da companhia
					voo.get(1),
					comp, voo.get(2),
					new Tempo(voo.get(3))));
		}

		// a)

		//System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
		/* for (voos v : l_voos) {
			 System.out.println(v);				//	Para testar basta tirar os comentarios
		} */

		// b)
		PrintWriter out = new PrintWriter(new File("InfoPublico.txt"));
		out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
		for (voos v : l_voos) {
			out.println(v);
		}
		out.close();

		// c)
		Map<String, Double> mapa_A = new HashMap<>();
		Map<String, Double> mapa_A_2 = new HashMap<>();
		Map<String, Double> mapa_A_3 = new HashMap<>();

		for (voos Emp : l_voos) {
			if (!mapa_A.containsKey(Emp.getCompanhia())) {
				String S = Emp.getAtraso().toString();
				double mins = Integer.parseInt(S.split(":")[0])*60 + Integer.parseInt(S.split(":")[1]);
				mapa_A.put(Emp.getCompanhia(), mins);
				mapa_A_2.put(Emp.getCompanhia(), 1.0);
				mapa_A_3.put(Emp.getCompanhia(), mins);
				
			} else {
				String S_2 = Emp.getAtraso().toString();
				int mins_2 = Integer.parseInt(S_2.split(":")[0])*60 + Integer.parseInt(S_2.split(":")[1]);
				mapa_A.put(Emp.getCompanhia(), ((mapa_A.get(Emp.getCompanhia())+mins_2)));
				mapa_A_2.put(Emp.getCompanhia(), ((mapa_A_2.get(Emp.getCompanhia())+1)));
				mapa_A_3.put(Emp.getCompanhia(), ((mapa_A.get(Emp.getCompanhia())))/(mapa_A_2.get(Emp.getCompanhia())));				
			}
		}

		ArrayList<Company> c_orde = new ArrayList<>();

		for (String key : mapa_A_3.keySet()) {
			c_orde.add(new Company(key, mapa_A_3.get(key)));
		}
		Collections.sort(c_orde);
		System.out.printf("%-25s%-30s\n", "Origem", "Voos");
		for (Company c : c_orde) {
			System.out.printf("%-25s%-30s\n", c.getName(), c.getMedia());
		}
    
		// d)

		HashMap<String, Integer> mapa_Cit = new HashMap<>();

		for (ArrayList<String> V : listaVoos) {

			if (!mapa_Cit.containsKey(V.get(2))) {
				mapa_Cit.put(V.get(2), 1);

			} else {
				mapa_Cit.put(V.get(2), mapa_Cit.get(V.get(2)) + 1);
			}

		}

		ArrayList<Quantidade> c_orde_2 = new ArrayList<>();

		for (String key : mapa_Cit.keySet()) {
			c_orde_2.add(new Quantidade(key, mapa_Cit.get(key)));
		}
		Collections.sort(c_orde_2);
		PrintWriter out_2 = new PrintWriter(new File("cidades.txt"));
		out_2.printf("%-25s%-30s\n", "Origem", "Voos");
		for (Quantidade n : c_orde_2){
			out_2.printf("%-25s%-30s\n", n.getName(), n.getN_voos());
		}
		out_2.close();
		/* 
		
		mapa_Cit
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(entry -> 
				
				 */
    }
}

