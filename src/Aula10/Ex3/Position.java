package Aula10.Ex3;

import java.util.*;

public class Position {
    public static void main(String[] args) {
        String s1 = "Hello World";
        char[] ch = s1.toCharArray();

        Map<Character, TreeSet<Integer>> mapa = new HashMap<>();

        for (int i = 0; i < s1.length(); i++){
            char  any_c = ch[i];
            
            if (mapa.containsKey(any_c)){
                mapa.get(any_c).add(i);
            }
            else{
                TreeSet<Integer> pos = new TreeSet<>();
				pos.add(i);
				mapa.put(any_c, pos);
            }
        }
        System.out.println(mapa);
    }

}
