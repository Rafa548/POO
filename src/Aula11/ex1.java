package Aula11;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException {
        String anterior, current = "";
        Map<String, Map<String, Integer>> mapa = new HashMap<>();
        Scanner input = new Scanner(new FileReader("major.txt")); // copiar do ex2 da aula 10 para a pasta do projeto
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.replaceAll("[\t\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"\']", "");
            String[] words = line.trim().split("[\s]+");
            for(int i = 0; i<words.length; i++) {
                int x = 0;
                boolean couldntfindword = false;
                if(i+1 == words.length){
                    anterior = words[i];
                    continue;
                }
                if(words[i].length()<3){
                    continue;
                }
                anterior = words[i];
                do{
                    x += 1;
                    if (i+x == words.length) {
                        couldntfindword = true;
                        break;
                    }
                    current = words[i+x];
                } while(current.length() < 3);
                if(couldntfindword){
                    continue;
                }
                if (mapa.containsKey(anterior)) {
                    if (mapa.get(anterior).containsKey(current)) {
                        mapa.get(anterior).put(current, mapa.get(anterior).get(current) + 1);
                    } else {
                        mapa.get(anterior).put(current, 1);
                    }
                } else {
                    Map<String, Integer> temphashmap = new HashMap<>();
                    temphashmap.put(current, 1);
                    mapa.put(anterior, temphashmap);
                }
            }
        }
        System.out.println(mapa);
    }

}
