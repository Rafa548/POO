package Aula08.Ex1;

public class Ligeiro extends Veiculo{
    private int n_quadro;
    private int cap_bag;

    public Ligeiro(String matricula, String marca,String modelo,int potencia,int n_quadro, int cap_bag){
        super(matricula, marca, modelo, potencia);
        this.n_quadro = n_quadro;
        this.cap_bag = cap_bag;
    }
    public int getN_quadro(){
        return n_quadro;
    }
    public int getCap_bag(){
        return cap_bag;
    }

    public void setN_quadro(int n_quadro) {
        this.n_quadro = n_quadro;
    }
    public void setCap_bag(int cap_bag){
        this.cap_bag = cap_bag;
    }
}
