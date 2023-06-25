package Aula8;

abstract class Alimento {
    protected double calorias;
    protected double peso;
    protected double proteins;
    public Alimento(double calorias, double peso, double proteins) {
        this.calorias = calorias;
        this.peso = peso;
        this.proteins = proteins;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    @Override
    public String toString() {
        return "Alimento{" + "calorias=" + calorias + ", peso=" + peso + '}';
    }
    
}
