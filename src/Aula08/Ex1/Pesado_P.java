package Aula08.Ex1;

public class Pesado_P extends Pesado{
    private int n_pass;

    public Pesado_P(String matricula, String marca, String modelo,int potencia,int n_quadro, int peso, int n_pass){
        super(matricula,marca,modelo,potencia,n_quadro,peso);
        this.n_pass = n_pass;
    }

    public int getN_pass(){
        return n_pass;
    }

    public void setN_pass(int n_pass){
        this.n_pass = n_pass;
    }
}
