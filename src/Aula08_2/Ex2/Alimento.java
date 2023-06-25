package Aula08_2.Ex2;

public class Alimento {
    private Double protein;
    private Double calories;
    private Double weight;
    
    public Alimento(Double protein, Double calories, Double weight){
        this.protein = protein;
        this.calories = calories;
        this.weight = weight;
    }

    public Double getprotein(){
        return protein;
    }

    public Double getcalories(){
        return calories;
    }

    public Double getweight(){
        return weight;
    }

    public void setprotein( Double protein){
        this.protein = protein;
    }

    public void setcalories(Double calories){
        this.calories = calories;
    }

    public void setweight(Double weight){
        this.weight = weight;
    }
    
}
