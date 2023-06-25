package Aula8;

public class PesadoMerc extends Veiculo {
    private int quadro;
    private double weight;
    private double capacidade;

    public PesadoMerc(String matricula, String marca, String modelo, int ano, int quadro, double weight, double capacidade) {
        super(matricula, marca, modelo, ano);
        this.quadro = quadro;
        this.weight = weight;
        this.capacidade = capacidade;
    }

    public int getQuadro() {
        return this.quadro;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "PesadoMerc{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", quadro=" + quadro + ", weight=" + weight + "kg, capacidade=" + capacidade + "kg}";
    }
    
}
