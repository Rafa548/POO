package Aula08_2;

public class Empresa {
    private String nome;
    private String cod_p;
    private String email;
    private Veiculo[] veiculos = new Veiculo[10];
    private int n_v;

    public Empresa(String nome, String codePostal, String email) {
        this.nome = nome;
        this.cod_p = codePostal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCodePostal() {
        return cod_p;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodePostal(String codePostal) {
        this.cod_p = codePostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void add_v(Veiculo x){
        if (n_v < veiculos.length){
            veiculos[n_v] = x;
            n_v++;
        }
    }
}
