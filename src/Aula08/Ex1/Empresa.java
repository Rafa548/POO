package Aula08.Ex1;

public class Empresa {
    private String nome, codePostal, email;
    private Veiculo[] veiculos = new Veiculo[10];
    private int numV = 0;

    public Empresa(String nome, String codePostal, String email) {
        this.nome = nome;
        this.codePostal = codePostal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addVehicle(Veiculo v) {
        if(numV < veiculos.length) {
            veiculos[numV] = v;
            numV++;
        }
    }
}
