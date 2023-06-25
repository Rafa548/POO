package Treino20202021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Gastronomia extends Atividade {

    private List<Restaurante> lista = new ArrayList<Restaurante>();


    public Gastronomia(int id, String name) {
        super(id, name);
    }

    public Gastronomia(int id, String name, List<Restaurante> lista) {
        super(id, name);
        this.lista = lista;
    }

    public Collection<String> getLista() {
        return locais();
    }

    public int totalRestaurantes() {
        return lista.size();
    }

    public void add(Restaurante r) {
        lista.add(r);
    }

    @Override
    public Collection<String> locais() {
        Collection<String> c = new ArrayList<String>();
        for (Restaurante r : lista) {
            c.add(r.toString());
        }
        return c;
    }
    
}
