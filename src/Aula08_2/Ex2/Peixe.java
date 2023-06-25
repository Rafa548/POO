package Aula08_2.Ex2;

public class Peixe extends Alimento{
    private TipoPeixe t_p;

    public Peixe(TipoPeixe t_p, Double protein, Double calories, Double weight) {
        super(protein, calories, weight);
        this.t_p = t_p;
    }
    
    public TipoPeixe getTipo(){
        return t_p;
    }

    public void setTipo(TipoPeixe t_p){
        this.t_p = t_p;
    }

    public String toString() {
        return "Peixe "  + this.getTipo() + "," + " Proteinas  " + this.getprotein() + "," + " Calorias " + this.getcalories() + "," +  " Peso  " + this.getweight() ;

    }

    
}
