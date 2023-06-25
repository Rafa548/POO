package Aula08_2.Ex2;

public class PratoDieta extends Prato{
    private Double maxcal;

    PratoDieta(String name, Double maxcal) {
        super(name);
        this.maxcal = maxcal;
    }

    @Override
    public Boolean addIngrediente(Alimento x){
        if (CalTotal() + x.getcalories() > maxcal){
            return false;
        }
        return super.addIngrediente(x);
    }
    
}
