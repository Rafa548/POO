package ExamePratico;

public abstract class Activity {
    protected int n_participantes;
    protected int preco;


    public int getN_participantes() {
        return n_participantes;
    }
    public void setN_participantes(int n_participantes) {
        this.n_participantes = n_participantes;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String toString() {
        String s = "";
        return s;

    }
}
