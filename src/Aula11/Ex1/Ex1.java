package Aula11.Ex1;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("major.txt",StandardCharsets.UTF_8));
        input.useDelimiter("[\\p{Punct}\\s]+");
        ArrayList<String> words = new ArrayList<>();
        Map<String, HashMap<String, Integer>> pares= new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 3) {
                words.add(word);
            }
            
        }
        
        for (int i = 0;i<words.size()-1;i++ ) {
            String agr = words.get(i);
            String dps = words.get(i+1);
            if (pares.get(agr) == null) {
                HashMap<String, Integer> mapa = new HashMap<>();
                mapa.put(dps,1);
                pares.put(agr,mapa);
            }
            else {
                if (pares.get(agr).get(dps) == null) {
                    pares.get(agr).put(dps,1);
                } 
                else {
                    pares.get(agr).replace(dps, pares.get(agr).get(dps), pares.get(agr).get(dps)+1);
                } 
                    
            }

        }
        input.close();
		for(int i = 0; i < pares.size(); i++) {
			System.out.println(pares.entrySet().toArray()[i].toString());
			
		}
    }    
    
}
