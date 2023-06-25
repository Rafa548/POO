package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Voo {
    private String Hora, Voo, Companhia, Origem, Atraso, Obs;

    public Voo(String Hora, String Voo, String Origem, String Atraso) {
        this.Hora = Hora;
        this.Voo = Voo;
        try {
            this.Companhia = Companhia(Voo);
        } catch (Exception e) {
            this.Companhia = "ERROR";
            System.out.println("Failed to read file");
            e.printStackTrace();
        }
        this.Origem = Origem;
        this.Atraso = Atraso;
        this.Obs = CalcObs(Hora, Atraso);
    }

    public Voo(String Hora, String Voo, String Origem) {
        this.Hora = Hora;
        this.Voo = Voo;
        try {
            this.Companhia = Companhia(Voo);
        } catch (Exception e) {
            this.Companhia = "ERROR";
            System.out.println("Failed to read file");
        }
        this.Origem = Origem;
        this.Atraso = "";
        this.Obs = "";
    }

    private String Companhia(String Voo) throws IOException {
        Scanner companies = new Scanner(new FileReader("companhias.txt"));
        while(companies.hasNextLine()){
            String line = companies.nextLine();
            String[] words = line.split("\t");
            String compareto = Voo.substring(0, 2);
            if(compareto.equals(words[0])){
                return words[1];
            }
        }
        return "NULL";
    }
    
    private String CalcObs(String Hora, String Atraso){
        int horaprevista, minprevisto, horaatraso, minatraso;
        String[] Horas = Hora.split(":");
        String[] Atrasos = Atraso.split(":");
        horaprevista = Integer.valueOf(Horas[0]);
        minprevisto = Integer.valueOf(Horas[1]);
        horaatraso = Integer.valueOf(Atrasos[0]);
        minatraso = Integer.valueOf(Atrasos[1]);

        int finalmins = minatraso + minprevisto;
        int finalhoras = horaatraso + horaprevista;
        while(finalmins >= 60){
            finalmins -= 60;
            finalhoras += 1;
        }
        
        String result = "Previsto: %02d:%02d";
        return String.format(result, finalhoras, finalmins);
    }

    public String getHora() {
        return Hora;
    }

    public String getVoo() {
        return Voo;
    }

    public String getCompanhia() {
        return Companhia;
    }

    public String getOrigem() {
        return Origem;
    }

    public String getAtraso() {
        return Atraso;
    }

    public String getObs() {
        return Obs;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-11s %-21s %-25s %-8s %-15s", Hora, Voo, Companhia, Origem, Atraso, Obs);
    }

}
