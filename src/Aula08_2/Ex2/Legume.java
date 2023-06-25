package Aula08_2.Ex2;

public class Legume extends Alimento implements Vegetariano{
    private String name;

    public Legume( String name,Double protein, Double calories, Double weight) {
        super(protein, calories, weight);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Legume "  + this.getName() + "," + " Proteinas  " + this.getprotein() + "," + " Calorias " + this.getcalories() + "," +  " Peso  " + this.getweight() ;
    }
}
