package Aula08.Ex1;

public class Pesado_P_E extends Pesado_P implements VeiculoEletrico{
    private int autonomia;

    public Pesado_P_E(String matricula, String marca, String modelo,int potencia,int n_quadro, int peso, int n_pass,int autonomia){
        super(matricula,marca,modelo,potencia,n_quadro,peso,n_pass);
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
