package Aula8;

public class Legume extends Alimento implements Vegetariano {
    private String nome;
    
    public Legume(String nome, double calorias, double peso, double proteins) {
        super(calorias, peso, proteins);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Legume" + nome + ", Proteinas " + proteins + ", calorias " + calorias + ", Peso " + peso;
    }

}
