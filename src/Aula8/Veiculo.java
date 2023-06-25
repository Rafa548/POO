package Aula8;

public class Veiculo implements KmPercorridosInterface {
    private int totaldistance = 0;
    private int targetkm = 0;
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    
    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    public void trajeto(int km) {
        this.targetkm = km;
        this.totaldistance += km;
    }

    public int ultimaTrajeto() {
        return this.targetkm;
    }

    public int distanciaTotal() {
        return this.totaldistance;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Veiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }


}