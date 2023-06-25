package Aula10.Ex1;

import java.util.Map;
import java.util.HashMap;

public class Termos {
    public static void main(String[] args) {
        Map<String, String> mapa= new HashMap<>();
        mapa.put("Azul ", " Cor do mar");
        mapa.put("Azul claro ", " Cor do ceu");
        mapa.put("Red ", " Vermelho em Ingles");
        mapa.put("Yellow ", " Amarelo em Ingles");
        mapa.put("Branco ", " Cor da neve");
        System.out.println("O mapa contém "+ (mapa.size()) + " cores");
        System.out.println("Existe amarelo no mapa? "+ mapa.containsValue("Amarelo em Ingles"));
        System.out.println("O mapa diz que Yellow é"+  mapa.get("Yellow "));
        mapa.put("Branco ", mapa.get("Branco ") + "!");
        System.out.println(mapa.toString());
        System.out.println(mapa.values().toString());
        System.out.println(mapa.keySet().toString());
        mapa.remove("Red ");
        System.out.println(mapa);
    }
}
