package Aula8;

public class PesadoPass extends Veiculo {
    private int quadro;
    private double weight;
    private int capacidadePassageiros;

    public PesadoPass(String matricula, String marca, String modelo, int ano, int quadro, double weight, int capacidadePassageiros) {
        super(matricula, marca, modelo, ano);
        this.quadro = quadro;
        this.weight = weight;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getQuadro() {
        return this.quadro;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String toString() {
        return "PesadoPass{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", quadro=" + quadro + ", weight=" + weight + "kg, capacidadePassageiros=" + capacidadePassageiros + "}";
    }   
}
