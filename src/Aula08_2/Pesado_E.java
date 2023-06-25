package Aula08_2;

public class Pesado_E extends Pesado_P implements Eletricos{
    private int autonomia;

    public Pesado_E(String matricula, String marca, String modelo,int potencia,int n_quadro, int peso, int n_pass, int aut){
        super(matricula,marca,modelo,potencia,n_quadro,peso,n_pass);
        this.autonomia = aut;
    }

    public int getAutonomia(){
        return autonomia;
    }

    public void setAutonomia(int km){
        this.autonomia = km;
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
