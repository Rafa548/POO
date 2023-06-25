package Aula08_2.Ex2;

public class PratoVegetariano extends Prato{
    PratoVegetariano(String name) {
        super(name);
    }

    @Override
    public Boolean addIngrediente(Alimento x) {
        if ( x instanceof Carne){
            return false;
        }
        else if (x instanceof Peixe){
            return false;
        }
        return super.addIngrediente(x);
    }
    
}
