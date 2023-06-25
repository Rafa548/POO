package Treino20192020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Livro extends Produto{
    private String titulo;
    private HashSet<Autor> autores = new HashSet<Autor>();

    public Livro(String titulo, double preco) {
        super("L");
        this.titulo = titulo;
        this.preco = preco;
    }

    public Livro(String titulo, double preco,List<Autor> aut) {
        super("L");
        this.titulo = titulo;
        this.preco = preco;
        for (Autor a : aut){
            autores.add(a);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void add(Autor a){
        autores.add(a);
    }

    public HashSet<Autor> getLista(){
        return autores;
    }

    public int numeroAutores() {
        return autores.size();
    }

    public ArrayList<String> autores() {
        ArrayList<String> lista = new ArrayList<String>();
        for(Autor a : autores){
            lista.add(a.toString());
        }
        return lista;
    }

    @Override
    public double precoVendaAoPublico(){
        return preco+(preco*(0.06));
    }

    @Override
    public String getDescricao() {
        return titulo;
    }
    
}
