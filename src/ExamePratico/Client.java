package ExamePratico;

public class Client {
    private String nome;
    private String localidade;


    public Client(String nome, String local) {
        this.nome = nome;
        this.localidade = local;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    @Override
    public String toString() {
        return nome +" [" + localidade + "]";
    }
}
