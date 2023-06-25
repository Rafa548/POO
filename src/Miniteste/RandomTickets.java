package Miniteste;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RandomTickets {

    private HashMap<String,Integer> tickets;
    private HashMap<Person, HashMap<String, Integer>> personTickets = new HashMap<>();

    public RandomTickets() throws IOException{
        tickets = data();
    }

    public void setTickets(HashMap<String,Integer> tickets){
        this.tickets = tickets;
    }
    

    public HashMap<String,Integer> data() throws IOException{
        HashMap<String,Integer> f_map = new HashMap<String,Integer>();
        Scanner input = new Scanner(new FileReader("Lista_festivais.txt"));
        input.nextLine();
        String[] params;
        while(input.hasNextLine()){
            params = input.nextLine().split("\\t");
            f_map.put(params[2],Integer.parseInt(params[4]));
        }
        return f_map;
    }

    /* public HashMap<Person, HashMap<String, Integer>> getRandomTicket(Person person) throws IOException {
        HashMap<String,Integer> f_map_2 = new HashMap<String,Integer>();
        f_map_2 = data();
        if (!personTickets.containsKey(person)){

        }
    } */


    public void listPersons() {
    }


    public void listAvailableTickets() {
    }
    


}
