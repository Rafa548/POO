package Aula8;

public class Carne extends Alimento {
    private VariedadeCarne variety;

    public Carne(VariedadeCarne variety, double proteins, double calorias, double peso) {
        super(calorias, peso, proteins);
        this.variety = variety;
    }

    public VariedadeCarne getVariety() {
        return variety;
    }

    public void setVariety(VariedadeCarne variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Carne" + variety + ", Proteinas " + proteins + ", calorias " + calorias + ", peso " + peso;
    }

        
}



