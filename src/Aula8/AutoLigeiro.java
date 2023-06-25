package Aula8;

public class AutoLigeiro extends Veiculo {
    private int quadro;
    private int capacidade;

    public AutoLigeiro(String matricula, String marca, String modelo, int ano, int quadro, int capacidade) {
        super(matricula, marca, modelo, ano);
        this.quadro = quadro;
        this.capacidade = capacidade;
    }

    public int getQuadro() {
        return this.quadro;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "AutoLigeiro{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", quadro=" + quadro + ", capacidade=" + capacidade + '}';
    }
}
