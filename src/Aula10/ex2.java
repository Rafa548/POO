package Aula10;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        mapa.put("branco", new ArrayList<String>());
        mapa.put("test1key", new ArrayList<String>());
        mapa.put("test2key", new ArrayList<String>());
        mapa.put("test3key", new ArrayList<String>());
        mapa.put("test4key", new ArrayList<String>());
        mapa.get("branco").add("Que tem a cor da neve.");
        mapa.get("test1key").add("test1value");
        mapa.get("test2key").add("test2value");
        mapa.get("test2key").add("test2value2");
        mapa.get("test2key").add("test2value4");
        mapa.get("test2key").add("test2value3");
        mapa.get("test3key").add("test3value");
        mapa.get("test4key").add("test4value");

        for (Map.Entry<String, ArrayList<String>> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        System.out.println();
        System.out.println(random(mapa, "test2key"));
        System.out.println(random(mapa, "test2key"));
    }

    public static String random(Map<String, ArrayList<String>> map, String key) {
        ArrayList<String> list = map.get(key);
        int index = (int) (Math.random() * list.size());
        return list.get(index);
    }
}
