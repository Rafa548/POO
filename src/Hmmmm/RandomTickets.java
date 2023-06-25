package Hmmmm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RandomTickets {
    private Map<Integer, List<String>> ticketInfo;
    private Map<Person, String[]> ticketDistribution = new HashMap<Person, String[]>();

    public RandomTickets() {
        try {
            Scanner ticketList = new Scanner(new File("Lista_festivais.txt"));
            ticketInfo = new java.util.HashMap<Integer, List<String>>();
            int x = 0;
            ticketList.nextLine();
            while (ticketList.hasNextLine()) {
                String line = ticketList.nextLine();
                String[] ticket = line.split("\t");
                List<String> aux = new java.util.ArrayList<String>();
                for (String s : ticket) {
                    aux.add(s);
                }
                aux.add("0");
                ticketInfo.put(x, aux);
                x += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getRandomTicket(Person p) {
        int ticketNumber = (int) (Math.random() * ticketInfo.size());
        List<String> info = ticketInfo.get(ticketNumber);
        String ticket = info.get(2);
        int maxTickets = Integer.parseInt(info.get(4));
        int TicketsRented = Integer.parseInt(info.get(5));
        if (ticketDistribution.containsKey(p)) {
            if (ticketDistribution.get(p).length < 2) {
                if (TicketsRented < maxTickets) {
                    String[] aux = new String[ticketDistribution.get(p).length + 1];
                    aux[0] = ticketDistribution.get(p)[0];
                    aux[1] = ticket;
                    ticketDistribution.put(p, aux);
                    TicketsRented += 1;
                }
            }
        } else {
            if (TicketsRented < maxTickets) {
                String[] aux = new String[1];
                aux[0] = ticket;
                ticketDistribution.put(p, aux);
                TicketsRented += 1;
            }
        }
        info.set(5, Integer.toString(TicketsRented));
    }

    public void listPersons() {
        System.out.println("Lista de pessoas:");
        for (Person p : ticketDistribution.keySet()) {
            System.out.println(p.toString() + " -> " + Arrays.toString(ticketDistribution.get(p)));
        }
    }

    public void listAvailableTickets() {
        System.out.println("Lista de bilhetes disponíveis:");
        for (int i = 0; i < ticketInfo.size(); i++) {
            List<String> info = ticketInfo.get(i);
            int rentedTickets = Integer.parseInt(info.get(5));
            int maxTickets = Integer.parseInt(info.get(4));
            if (rentedTickets < maxTickets) {
                System.out.println(info.get(2) + " has " + (maxTickets - rentedTickets) + " available tickets.");
            } else if (rentedTickets == maxTickets) {
                System.out.println(info.get(2) + " has no available tickets.");
            } else {
                System.out.println("An error occurred.");
                System.out.println(rentedTickets);
                System.out.println(maxTickets);
            }
        }
    }
}
