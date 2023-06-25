package Treino20202021;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AgenciaTuristica{
    private String local;
    private String nome;
    private Set<Atividade> l_1 = new HashSet<Atividade>();
    private TreeSet<String> l_2 = new TreeSet<String>();

    public AgenciaTuristica(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void add(Atividade a){
        l_1.add(a);
    }

    public void add_2(String x){
        l_2.add(x);      
    }

    public TreeSet<String> getAllItems(){
        return l_2;
    }

    public int totalItems() {
        int count = 0;
		for (Atividade x :l_1){
            count += x.locais().size();
        }
        return count;
	}
    
    public String toString() {
        return "AGENCIA: " + nome + "\n" + l_1;
    }

    public Set<Atividade> atividades() {
        return l_1;
    }
}
