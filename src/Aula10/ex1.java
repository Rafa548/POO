package Aula10;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {        
        Map<String, String> mapa = new HashMap<>();
        mapa.put("branco", "Que tem a cor da neve.");
        mapa.put("test1key", "test1value.");
        mapa.put("test2key", "test2value.");
        mapa.put("test3key", "test3value.");
        mapa.put("test4key", "test4value.");
        
        for(Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
    }
}