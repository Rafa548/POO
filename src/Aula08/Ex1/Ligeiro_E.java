package Aula08.Ex1;

public class Ligeiro_E extends Ligeiro implements VeiculoEletrico{
    private int autonomia;

    Ligeiro_E(String matricula, String marca,String modelo,int potencia,int n_quadro, int cap_bag, int autonomia){
        super(matricula,marca,modelo,potencia,n_quadro,cap_bag);
        this.autonomia = autonomia;
    }

    public int autonomia(){
        return autonomia;
    }

    public void carregar(int percentagem){
        float x = 0;
        do{ 
            System.out.println("Battery charge level -> " + x);
            x+=0.01;
        }
        while(x<percentagem);
        System.out.println("Charge level reached");
    }
}
