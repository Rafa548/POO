package Aula10.Ex2;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Termos_2 {
    public static void main(String[] args) {
        List<String> signi_A = new ArrayList<>();
        signi_A.add("Cor do mar");
        signi_A.add("Blue in english");
        List<String> signi_Ac = new ArrayList<>();
        signi_Ac.add("Cor do ceu");
        signi_Ac.add("Light blue in english");
        List<String> signi_R = new ArrayList<>();
        signi_R.add("Cor do Stop");
        signi_R.add("Vermelho em portugues");
        List<String> signi_Y = new ArrayList<>();
        signi_Y.add("Cor do ceu");
        signi_Y.add("Amarelo em portugues");
        List<String> signi_B = new ArrayList<>();
        signi_B.add("Cor da neve");
        signi_B.add("White in english");

        Map<String, List<String>> mapa = new TreeMap<>();

        mapa.put("Azul ", signi_A);
        mapa.put("Azul claro ", signi_Ac);
        mapa.put("Red ", signi_R);
        mapa.put("Yellow ", signi_Y);
        mapa.put("Branco ", signi_B);

        System.out.println("O mapa contém " + (mapa.size()) + " cores");
        System.out.println("Existe amarelo no mapa? " + mapa.containsKey("Yellow "));
        System.out.println("O mapa diz que Yellow é " + mapa.get("Yellow "));

        System.out.println(mapa.toString());
        System.out.println(mapa.values().toString());
        System.out.println(mapa.keySet().toString());
        mapa.remove("Red ");
        System.out.println(mapa);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        termo_random(mapa,"Azul ");
        termo_random(mapa,"Azul ");         //3 para aumentar a chance de serem diferentes
        termo_random(mapa,"Azul ");
        termo_random(mapa,"Branco ");
        termo_random(mapa,"Branco ");
        termo_random(mapa,"Branco ");
        
    }

    public static void termo_random(Map<String, List<String>>  x,String y){
        List<String> lst = new ArrayList<>();
        lst = x.get(y);
        Random rand =  new Random();
        int r1 = rand.nextInt(lst.size());
        System.out.println(lst.get(r1));
    }

}
