package Miniteste_Joao;

import java.util.*;
import java.io.IOException;
import java.io.FileReader;

public class RandomTickets {

    private HashMap<String, Integer> tickets;
    private HashMap<Person, HashMap<String, Integer>> personTickets = new HashMap<>();
    public RandomTickets() {
        try {
            tickets = fetchFestivalTickets();
        } catch (IOException ie) {
            ie.printStackTrace();
        }   
    }
    public HashMap<String, Integer> getTickets() {
        return tickets;
    }
    public HashMap<Person, HashMap<String, Integer>> getPersonTickets() {
        return personTickets;
    }
    public void setTickets(HashMap<String, Integer> tickets) {
        this.tickets = tickets;
    }
    public void setPessoaTickets(HashMap<Person, HashMap<String, Integer>> personTickets) {
        this.personTickets = personTickets;
    }
    public HashMap<String, Integer> fetchFestivalTickets() throws IOException {
        Scanner input = new Scanner(new FileReader("src/QA/Files/Lista_festivais.txt"));
        HashMap<String, Integer> ticketMap = new HashMap<String, Integer>(); // guardar aqui os bilhetes em pares "Festival" - nº bilhetes
        input.nextLine(); // 1º linha é cabeçalho
        String[] aux; // string auxiliar
        while (input.hasNextLine()) {
            aux = input.nextLine().split("\\t");
            ticketMap.put(aux[2], Integer.parseInt(aux[4]));
        }

        return ticketMap;
    }
    public void getRandomTicket(Person p) { // devolve o nome do festival do bilhete recebido
        HashMap<String, Integer> ticketMap = new HashMap<String, Integer>(); // guardar aqui os bilhetes em pares "Festival" - nº bilhetes
        ticketMap = getTickets(); 
        ArrayList<String> festivais = new ArrayList<>(); // arrayList com os nomes de festivais
        for (String key : this.getTickets().keySet())
            festivais.add(key);
        int randomnum = (int) (Math.random() * festivais.size()); // numero aleatorio entre 0 e o nº de festivais
        while (tickets.get(festivais.get(randomnum)) <= 0)
            randomnum = (int) (Math.random() * festivais.size());
        // Após decidir o bilhete a receber, será preciso atualizar a lista de bilhetes e remover 1 ao bilhete escolhido
        // atualizar o nº de bilhetes do festival escolhido
        ticketMap.put(festivais.get(randomnum), ticketMap.get(festivais.get(randomnum)) - 1);

        // finalmente, dar set ao novo mapa de tickets
        setTickets(ticketMap);

        // No final, é preciso associar à pessoa o bilhete recebido
        HashMap<Person, HashMap<String,Integer>> ticketsPessoa = new HashMap<>();
        ticketsPessoa = this.getPersonTickets();
        // ir buscar o nº de tickets desta pessoa, neste festival
        ticketsPessoa.putIfAbsent(p, new HashMap<String, Integer>());
        int numTickets = ticketsPessoa.get(p).getOrDefault(festivais.get(randomnum), -1); 
        // -1 significa que esta pessoa não tem tickets deste festival
        if (numTickets == -1) {
            ticketsPessoa.get(p).put(festivais.get(randomnum), 1);
        } 
        // se tiver 2 tickets de um festival, nao pode ter mais, portanto, adicionar 1 se tiver menos de 2
        else if (numTickets < 2)
            ticketsPessoa.get(p).put(festivais.get(randomnum), numTickets + 1);

    }
    public void listPersons() {
        for (Person p : this.getPersonTickets().keySet()) {
            System.out.println(p.getName());
        }
    }
    public void listAvailableTickets() {
        for (String s : this.getTickets().keySet()) {
            System.out.println(s + " - " + this.getTickets().get(s) + " bilhetes");
        }
    }

}
