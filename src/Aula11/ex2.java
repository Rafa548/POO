package Aula11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws IOException {
        List<Voo> VooList = new ArrayList<>();
        Scanner Voos = new Scanner(new FileReader("voos.txt"));
        Voos.nextLine();
        while (Voos.hasNextLine()) {
            String[] vooinfo = Voos.nextLine().split("\t");
            if (vooinfo.length == 4) {
                VooList.add(new Voo(vooinfo[0], vooinfo[1], vooinfo[2], vooinfo[3]));
            } else {
                VooList.add(new Voo(vooinfo[0], vooinfo[1], vooinfo[2]));
            }

        }

        System.out.println(String.format("%-8s %-11s %-21s %-25s %-8s %-15s", "Hora", "Voo", "Companhia", "Origem",
                "Atraso", "Obs"));
        for (Voo voo : VooList) {
            System.out.println(voo);
        }

        writetoFile(VooList); // ALINEA B
        LateMedian(VooList); // ALINEA C
        citieStats(VooList); // ALINEA D
    }

    // ALINEA B) ------------------------------------------------------------
    public static void writetoFile(List<Voo> VooList) {
        try {
            File file = new File("Infopublico.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.format("%-8s %-11s %-21s %-25s %-8s %-15s\n", "Hora", "Voo", "Companhia", "Origem",
                    "Atraso", "Obs"));
            for (Voo voo : VooList) {
                writer.write(voo.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to write to file");
            e.printStackTrace();
        }
    }

    // ALINEA C) ------------------------------------------------------------
    public static void LateMedian(List<Voo> VooList) {
        Map<String, AtrasoTotal> map = new HashMap<>();
        for (Voo voo : VooList) {
            if (!(voo.getAtraso() == "")) {
                if (map.containsKey(voo.getCompanhia())) {
                    AtrasoTotal aux = map.get(voo.getCompanhia());
                    aux.incrementAtraso(voo.getAtraso());
                    map.put(voo.getCompanhia(), aux);
                } else {
                    map.put(voo.getCompanhia(), new AtrasoTotal(voo.getCompanhia(), voo.getAtraso()));
                }
            }
        }
        List<AtrasoTotal> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(String.format("\n%-21s %-8s", "Companhia", "Atraso"));
        for (AtrasoTotal atraso : list) {
            System.out.println(atraso);
        }
    }

    // ALINEA D) ------------------------------------------------------------

    public static void citieStats(List<Voo> VooList) {
        Map<String, Cidades> map = new HashMap<>();
    
        for (Voo voo : VooList) {
            if (!voo.getOrigem().equals("")) {
                if (map.containsKey(voo.getOrigem())){
                    Cidades aux = map.get(voo.getOrigem());
                    aux.incrementVoosToCity();
                    map.put(voo.getOrigem(), aux);
                } else {
                    map.put(voo.getOrigem(), new Cidades(voo.getOrigem()));
                }
            }
        }
        List<Cidades> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        try {
            File file = new File("cidades.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.format("%-30s %-4s\n", "Origem", "Voos"));
            for (Cidades city : list) {
                writer.write(city.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to write to file");
            e.printStackTrace();
        }
    }
}
