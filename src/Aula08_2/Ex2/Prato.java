package Aula08_2.Ex2;

public class Prato implements Comparable<Prato> {
    private String name;
    private Alimento[] alimentos = new Alimento[2];
    private int n_A;

    Prato(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public Alimento[] getAlimentos() {
        return alimentos;
    }

    public void setN_alimentos() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public Double PesoTotal() {
        Double var_p = 0.0;
        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null) {
                Double var_a = alimentos[i].getweight();
                var_p += var_a;
            }
            
        }
        return var_p;
    }
    public Double CalTotal() {
        Double var_c = 0.0;
        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null) {
                Double var_a = alimentos[i].getcalories();
                var_c += var_a;
            }
            
        }
        return var_c;
    }
    public Double ProtTotal() {
        Double var_pr = 0.0;
        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null) {
                Double var_a = alimentos[i].getprotein();
                var_pr += var_a;
            }
            
        }
        return var_pr;
    }

    public Boolean addIngrediente(Alimento alimento) {
        if (n_A < alimentos.length){
            this.alimentos[n_A] = alimento;
            n_A++;
            return true;
        }
        return false;
    }

    public String toString(){
        return "Prato " +  "'"+ this.getName() + "'," + " composto por " + alimentos.length + " Ingredientes"; 
    }

    @Override
    public int compareTo(Prato p) {
        if(this.CalTotal() == p.CalTotal()){
            return 0;
        }
        else if(this.CalTotal() > p.CalTotal()) {
            return 1;
        }
        else{
            return -1;
        }
    }

}
