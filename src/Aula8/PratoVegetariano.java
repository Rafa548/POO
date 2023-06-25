package Aula8;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if (alimento instanceof Carne) {
            return false;
        }
        return super.addIngrediente(alimento);
    }
    
}
