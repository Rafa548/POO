package Aula8;

public class Prato implements Comparable<Prato> {
    private String nome;
    private Alimento[] alimentos = new Alimento[2];

    public Prato(String nome){
        this.nome = nome;
    }   

    public boolean addIngrediente(Alimento alimento){
        for(int i = 0; i < alimentos.length; i++){
            if (alimentos[i] == null){
                alimentos[i] = alimento;
                return true;
            }
        }
        return false;
    }

    public double pesoTotal(){
       double pesot = 0;
       for(int i = 0; i < alimentos.length; i++){
            if (alimentos[i] != null){
            pesot += alimentos[i].getPeso();
            }
        }
        return pesot; 
    }

    public double caloriasTotal(){
        double caloriast = 0;
        for(int i = 0; i < alimentos.length; i++){
            if (alimentos[i] != null){
                caloriast += alimentos[i].getCalorias();
            }
        }
        return caloriast;
    }

    public double proteinsTotal(){
        double proteinst = 0;
        for(int i = 0; i < alimentos.length; i++){
            if (alimentos[i] != null){
                proteinst += alimentos[i].getProteins();
            }
        }
        return proteinst;
    }

    public String toString(){
        return "Prato " + nome + ", composto por " + alimentos.length + " Ingredientes.";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Alimento[] getAlimentos(){
        return alimentos;
    }

    public void setAlimentos(Alimento[] alimentos){
        this.alimentos = alimentos;
    }
    
    @Override
    public int compareTo(Prato o) {
        Prato p = (Prato) o;
        if (this.caloriasTotal() > p.caloriasTotal()){
            return 1;
        }
        else if (this.caloriasTotal() < p.caloriasTotal()){
            return -1;
        }
        else{
            return 0;
        }
    }

    
}
