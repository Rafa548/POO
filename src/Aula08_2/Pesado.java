package Aula08_2;

public class Pesado extends Veiculo{
    private int n_quadro;
    private int peso;

    public Pesado(String matricula, String marca, String modelo,int potencia,int n_quadro, int peso){
        super(matricula,marca,modelo,potencia);
        this.n_quadro = n_quadro;
        this.peso = peso;
    }

    public int getN_quadro(){
        return n_quadro;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setN_quadro(int n_quadro){
        this.n_quadro = n_quadro;
    }
}
