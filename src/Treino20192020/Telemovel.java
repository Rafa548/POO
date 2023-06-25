package Treino20192020;

import java.util.HashSet;

public class Telemovel extends Produto{
    private String marca;
    private String modelo;
    private HashSet<String> notas = new HashSet<String>();

    public Telemovel(String marca, String modelo, double preco) {
        super("T");
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void addNota(String n) {
        notas.add(n);
    }

    @Override
    public String getDescricao() {
        return marca.toUpperCase()+"/"+modelo;
    }

    public String toString() {
        return marca;
    }
}
