package Aula08_2.Ex2;

public class Carne extends Alimento{
    private VariedadeCarne variadade;

    public Carne( VariedadeCarne var,Double protein, Double calories, Double weight) {
        super(protein, calories, weight);
        this.variadade = var;
    }

    public VariedadeCarne getVariadade() {
        return variadade;
    }

    public void setVariadade(VariedadeCarne variadade){
        this.variadade = variadade; 
    }
    public String toString() {
        return "Carne "  + this.getVariadade() + "," + " Proteinas  " + this.getprotein() + "," + " Calorias " + this.getcalories() + "," +  " Peso  " + this.getweight() ;
    }
}
