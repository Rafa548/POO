package Aula8;

public class Taxi extends AutoLigeiro {
    private int license;
    
    public Taxi(String matricula, String marca, String modelo, int ano, int quadro, int capacidade, int license) {
        super(matricula, marca, modelo, ano, quadro, capacidade);
        this.license = license;
    }

    public int getLicenca() {
        return this.license;
    }

    public void setLicenca(int licenca) {
        this.license = licenca;
    }

    @Override
    public String toString() {
        return "Taxi{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", quadro=" + getQuadro() + ", capacidade=" + getCapacidade() + ", licenca=" + license + '}';
    }
}

