package Aula08.Ex1;

public class Pesado_M extends Pesado {
    private int car_max;

    public Pesado_M(String matricula, String marca, String modelo,int potencia,int n_quadro, int peso, int car_max){
        super(matricula,marca,modelo,potencia,n_quadro,peso);
        this.car_max = car_max;
    }

    public int getCar_max(){
        return car_max;
    }

    public void setCar_max(int car_max){
        this.car_max = car_max;
    }
}
