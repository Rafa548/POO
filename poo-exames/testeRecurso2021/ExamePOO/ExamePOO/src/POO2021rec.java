
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.TreeMap;

public class POO2021rec {
	public static void main(String[] args) throws FileNotFoundException {
		String pre = Files.exists(Paths.get(System.getProperty("user.dir"),"src")) ?  "src/" :  "";
		PrintStream fl = new PrintStream(new File(pre+"POO2021recB.txt"));
		test(System.out); // executa e escreve na consola
		fl.println(System.getProperty("user.name") + "\n" + System.getProperty("user.dir"));
		test(fl); // executa e escreve no ficheiro
		fl.close();
	} 

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");

		// Adicione a seguir o código necessário, conforme pedido no enunciado
		Supermercado superm = new Supermercado("Vende Tudo");
		superm.addCaixa(1, TipoCaixa.OPERADOR);
		superm.addCaixa(2, TipoCaixa.SELFSERVICE);
		superm.addCaixa(3, TipoCaixa.EXPRESS);
		Operador op1 = new Operador(11, "Antonio", superm.getCaixa(1));
		Operador op3 = new Operador(15, "Joana", superm.getCaixa(3));
		superm.addTrabalhador(op1);
		superm.addTrabalhador(op3);
		Encarregado enc1 = new Encarregado(61, "Xavier");
		superm.addTrabalhador(enc1);
		enc1.atribuirEmpregado(op1);
		enc1.atribuirEmpregado(op3);
		
		
		System.out.print(superm.supermercadoInfo());
		System.out.print(superm);
		
		System.out.println(enc1);
		
		System.out.println(superm.getCaixa(2));
		
		enc1.mudaOperador(op1, op3);
		
		// Não modifique o metodo a partir daqui. Pode comentar para executar o programa

		
		Cliente cl1 = new Cliente("Jose", 30);
		Cliente cl2 = new Cliente("Hugo", 60);
		for(int i = 1; i<=3; i++) {
			out.println(cl1 + " - Caixa tipo " + superm.getCaixa(i).getTipoCaixa() + " - Desconto obtido = " + cl1.pagar(superm.getCaixa(i)));
			out.println(cl2 + " - Caixa tipo " + superm.getCaixa(i).getTipoCaixa() + " - Desconto obtido = " + cl2.pagar(superm.getCaixa(i)));
		}
		out.println("* Caixas cujo máximo de produtos é maior do que o número de produtos do cliente cl2");
		//out.println("Cliente " + cl2.getNome() + ": " + superm.getCaixasCliente(cl2));
		
	}

	private static void alinea2(PrintStream out) {
		out.println("\nAlínea 2) ----------------------------------\n");
		Scanner sc = null;
		TreeMap<Integer,ArrayList<String>> dados= new TreeMap<Integer, ArrayList<String>>(); 
		try {
			sc = new Scanner(new File("alunos.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("ERRO: "+e);
		}
		int numLinha = 0;
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			String dadosLinha [] = linha.split(";");
			if (dadosLinha.length == 3) {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp.add(dadosLinha[1]);
				tmp.add(dadosLinha[2]);
				dados.put(Integer.parseInt(dadosLinha[0]), tmp);
			
			}
		}
		//System.out.print(dados);
		
		try {
			FileWriter fw= new FileWriter("alunos.txt", true);
			PrintWriter pw= new PrintWriter(fw);
			pw.append("97787;19;Vicente Barros\n");			
			pw.close();
		} catch (IOException e){
			System.out.print("Erro ao Gravar");
		}

		int maiorMec = -1;
		int totalIdades = 0;
		TreeMap<String, Integer> occ = new TreeMap<String,Integer>();
		for (Integer nmec : dados.keySet()) {
			if (nmec > maiorMec) maiorMec = nmec;
			totalIdades+= Integer.parseInt(dados.get(nmec).get(0));
			String[] nomes = dados.get(nmec).get(1).split(" ");
			for (String n : nomes) {
				if (!occ.containsKey(n)) {
					occ.put(n, 1);
				} else {
					int n_occ = occ.get(n)+1;
					occ.put(n,n_occ);
				}
			}
		}
		//System.out.println(occ);
		String nome_maior= "";
		int occ_maior = -1;
		
		for (String n: occ.keySet()) {
			if (occ_maior< occ.get(n)) {
				nome_maior = n;
				occ_maior = occ.get(n);
			}
		}
		
		System.out.println("Nmec mais elevado ="+maiorMec);
		double media = (double)totalIdades/(double) dados.size();
		System.out.println("M�dia de idades ="+media);
		System.out.println("Nome mais repetido ="+nome_maior+"="+occ_maior);
	}
}
