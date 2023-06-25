package Aula8;

public class Ementa {
    private String nome;
    private String local;
    private Prato[] pratos = new Prato[7];

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Prato[] getPratos() {
        return pratos;
    }

    public void setPratos(Prato[] pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato prato, DiaSemana i) {
        if (prato != null) {
            pratos[i.ordinal()] = prato;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < pratos.length; i++) {
            if (pratos[i] != null) {
                if (pratos[i] instanceof PratoVegetariano) {
                    s += "Prato " + pratos[i].getNome() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes - Prato Vegetariano, dia " + DiaSemana.values()[i] + "\n";

                } else if (pratos[i] instanceof PratoDieta) {
                    s += "Prato " + pratos[i].getNome() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes - Dieta (" + pratos[i].caloriasTotal() + " Calorias), dia " + DiaSemana.values()[i] + "\n";

                } else {
                    s += "Prato " + pratos[i].getNome() + ", composto por " + pratos[i].getAlimentos().length
                            + " Ingredientes, dia " + DiaSemana.values()[i] + "\n";
                }
            }
        }
        return s;
    }
}
