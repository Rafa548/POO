package Aula8;

public class Peixe extends Alimento {
    private TipoPeixe type;

    public Peixe(TipoPeixe type, double proteins, double calorias, double peso) {
        super(calorias, peso, proteins);
        this.type = type;
    }

    public TipoPeixe getType() {
        return type;
    }	

    public void setType(TipoPeixe type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Peixe " + type + ", Proteinas " + proteins + ", calorias " + calorias + ", Peso" + peso;
    }


}
