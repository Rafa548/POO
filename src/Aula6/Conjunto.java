package Aula6;

public class Conjunto {

    private int[] intarr;
    private int insertedvalues = 0;

    public Conjunto() {
        intarr = new int[0];
    }

    private void addsize(int x, int[] temparr) {
        intarr = new int[x+1];
        for(int i = 0; i<temparr.length; i++){
            intarr[i] = temparr[i];
        }
    }

    private void removesize(int x, int[] temparr){
        intarr = new int[x-1];
        for(int i = 0; i<temparr.length-1; i++){
            intarr[i] = temparr[i];
        }  
    }

    public void insert(int x) {
        if(!contains(x)) {
            addsize(intarr.length, intarr);
            intarr[insertedvalues] = x;
            insertedvalues += 1;
        }
    }

    public boolean contains(int x) {
        boolean ver = false;
        for (int i = 0; i < intarr.length; i++) {
            if(intarr[i] == x){
                ver = true;
                break;
            }
        }
        return ver;
    }

    public void remove(int x) {
        boolean removed = false;
        for (int i = 0; i<this.size(); i++){
            if (intarr[i] == x) {
                intarr[i] =-1;
                removed = true;
            }
            
            if(removed){
                x = i+1;
                if (x < this.size()){
                    intarr[i] = intarr[x];
                }
            }
        }
        insertedvalues -=1;
        removesize(intarr.length, intarr);
    }

    public int size() {
        return intarr.length;
    }

    public Conjunto unir(Conjunto c) {

        Conjunto uniao = new Conjunto();

        for (int i = 0; i < this.size(); i++) {
            uniao.insert(intarr[i]);
        }

        for (int i = 0; i < c.size(); i++) {
            uniao.insert(c.intarr[i]);
        }

        return uniao;
    }

    public Conjunto intersection(Conjunto c) {

        Conjunto inter = new Conjunto();

        for (int i = 0; i < this.size(); i++) {
            if (c.contains(intarr[i])) {
                inter.insert(intarr[i]);
            }
        }

        return inter;
    }
    
    public Conjunto difference(Conjunto c) {
        
        Conjunto diff = new Conjunto();
        
        for (int i = 0; i < this.size(); i++) {
            if (!c.contains(intarr[i])) {
                diff.insert(intarr[i]);
            }
        }
        
        return diff;
    }

    public void empty() {
        intarr = new int[0];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.size(); i++) {
            s += intarr[i] + " ";
        }
        return s;
    }

}
