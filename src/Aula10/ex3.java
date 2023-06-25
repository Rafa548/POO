package Aula10;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        Map<Character, ArrayList<Integer>> mapa = new HashMap<>();
        String testphrase = "test string . please ignore";

        for (int i = 0; i < testphrase.length(); i++) {
            char c = testphrase.charAt(i);
            if (mapa.containsKey(c)) {
                mapa.get(c).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                mapa.put(c, list);
            }
        }
        
        System.out.println(mapa);
    }
}
