package Aula8;


public class AutoLigeiroElect extends AutoLigeiro implements VeiculoEletrico{
    private int bateria;

    public AutoLigeiroElect(String matricula, String marca, String modelo, int ano, int quadro, int capacidade, int bateria) {
        super(matricula, marca, modelo, ano, quadro, capacidade);
        this.bateria = 50;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int autonomia() {
        return this.bateria;
    }

    public void carregar(int carga) {
        this.bateria += carga;
    }

    @Override
    public String toString() {
        return "AutoLigeiroElect{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", quadro=" + getQuadro() + ", capacidade=" + getCapacidade() + ", bateria=" + bateria + '}';
    }
}