package Treino20192020;

public class Autor {
    private String nome;
    private int anonasc;

    public Autor(String nome, int anonasc) {
        this.nome = nome;
        this.anonasc = anonasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnonasc() {
        return anonasc;
    }
    public void setAnonasc(int anonasc) {
        this.anonasc = anonasc;
    }
    @Override
    public String toString() {
        return nome + " ("+anonasc+"-)";
    }
    
}
