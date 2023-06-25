package Aula11.Ex2;

public class Quantidade implements Comparable<Quantidade>{
    private String name;
    private int n_voos;

    public Quantidade(String name, int n_voos){
        this.name = name;
        this.n_voos = n_voos;
    }

    public String getName(){
        return name;
    }

    public int getN_voos(){
        return n_voos;
    }

    public void setN_voos(int n_v){
        this.n_voos = n_v;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Quantidade o){
        if (this.n_voos == o.n_voos ){
            return 0;
        }
        else if(this.n_voos < o.n_voos ){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
