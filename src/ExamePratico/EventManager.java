package ExamePratico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EventManager {
    private String nome;
    private Set<Client> client_list = new HashSet<Client>();
    private List<Event> clients = new ArrayList<Event>();


    public EventManager(String nome) {
        this.nome = nome;
    }

    public Client addClient(String nome, String local) {
        Client client = new Client(nome, local);
        client_list.add(client);
        return client;
    }

    public Event addEvent(Client c1, LocalDate parse) {
        Event nn = new Event(parse);
        clients.add(nn);
        return nn;
    }

    public String listClients() {
        String s = "";
        s += "Clients\n";
        for (Client c : client_list){
            s += c.toString() +"\n";
        }
        return s;
    }

    public String listEvents() {
        String s = "";
        
        return s;
    }
    
}
