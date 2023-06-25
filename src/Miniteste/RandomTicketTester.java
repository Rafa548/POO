package Miniteste;

import java.util.*;
import java.io.*;

public class RandomTicketTester {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new FileReader("Lista_festivais.txt"));
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<ArrayList<String>> lista_festivais = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lines.add(line);
        }
        for (int i=1;i<lines.size();i++){
            ArrayList<String> lista2 = new ArrayList<>();
            String[] params = lines.get(i).split("\t");
            for (String p : params){
                lista2.add(p);
            }
            lista_festivais.add(lista2);
        }

        ArrayList<Festivais> l_Festivais = new ArrayList<>();
        
        for (ArrayList<String> M : lista_festivais){
            l_Festivais.add(new Festivais(new DateYMD(M.get(0)),new DateYMD(M.get(1)),M.get(2),M.get(3),Integer.parseInt(M.get(4))));
        }

        RandomTickets tickets = new RandomTickets();

        List<Person> r = new ArrayList<Person>();        
        r.add(new Person("Maria", 34317245, new DateYMD(12, 1, 2000)));
        r.add(new Person("Carlos", 36331424, new DateYMD(1, 10, 2003)));
        r.add(new Person("Marta", 35940012, new DateYMD(31, 3, 2002)));
        r.add(new Person("Sofia", 34765901, new DateYMD(14, 7, 2000)));
        r.add(new Person("Tiago", 35006531, new DateYMD(3, 6, 2001)));



        // selecionar aleatoriamente uma pessoa, que receberá 1 ou 2 bilhetes para um dos festivais (escolhido aleatoriamente)
        // os bilhetes disponíveis estão listatos no ficheiro 'Lista_bilhetes.txt'

/* 
        for (int i=0; i<2*r.size(); i++) {
            int ri = (int) (Math.random()*r.size());
            tickets.getRandomTicket(r.get(ri));
        } */

        tickets.listPersons();
        tickets.listAvailableTickets();
    }
}
