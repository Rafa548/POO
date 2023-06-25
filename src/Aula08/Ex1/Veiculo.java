package Aula08.Ex1;

public class Veiculo implements KmPercorridosInterface{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int D_total = 0;
    private int U_dist = 0;

    Veiculo(String matricula, String marca, String modelo,int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void trajeto(int km) {
        U_dist = km;
        D_total += U_dist;
    }

    public int ultimoTrajeto(){
        return U_dist;
    }
    public int distanciaTotal(){
        return D_total;
    }

    public String toString() {
        return "Matrícula " + matricula + ", marca e modelo: " + marca + " " + modelo + ", cilindrada: " + potencia;
    }
}
