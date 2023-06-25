package Aula8;

public class PratoDieta extends Prato {
    private double maxCal;
    public PratoDieta(String nome, double maxCal) {
        super(nome);
        this.maxCal = maxCal;
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if (this.caloriasTotal() + alimento.getCalorias() > maxCal) {
            return false;
        }
        return super.addIngrediente(alimento);
    }

}
