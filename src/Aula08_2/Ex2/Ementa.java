package Aula08_2.Ex2;

public class Ementa {
    private String name;
    private String place;
    private Prato[] pratos = new Prato[7];
    private int n_pratos = 0;

    public Ementa(String name, String place){
        this.name = name;
        this.place = place;
    }

    public String getName(){
        return name;
    }

    public String getPlace(){
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place){
        this.place = place;
    }
    public void addPrato(Prato x, DiaSemana y){
        if (n_pratos < pratos.length){
            pratos[n_pratos] = x;
            n_pratos++;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < pratos.length; i++) {
            if (pratos[i] != null) {
                if (pratos[i] instanceof PratoVegetariano) {
                    s += "Prato " + pratos[i].getName() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes - Prato Vegetariano, dia " + DiaSemana.values()[i] + "\n";

                } else if (pratos[i] instanceof PratoDieta) {
                    s += "Prato " + pratos[i].getName() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes - Dieta (" + pratos[i].CalTotal() + " Calorias), dia " + DiaSemana.values()[i] + "\n";

                } else {
                    s += "Prato " + pratos[i].getName() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes, dia " + DiaSemana.values()[i] + "\n";
                }
            }
        }
        return s;
    }
}
