package Aula06.Ex2;

public class Conjunto {
    private int[] vetor;

    public Conjunto (){
        this.vetor = new int[0];
    }

    public int[] getVetor() {
	    return vetor;
	}

    public boolean contains(int n){
        for (int i = 0;i<vetor.length; i++){
            if(n == vetor[i]){
                return true;
            }
        }
        return false;   
    }
    
    public void insert(int n){
        if(this.contains(n)) {return;}
        int n_1 = vetor.length + 1;
        int[] v_2 = new int[n_1];
        for (int i = 0;i<vetor.length; i++){
            v_2[i] = vetor[i];
        }
        v_2[n_1-1] = n;
        vetor = v_2;
        
    }

    public void remove(int n){
        if(!this.contains(n)) {return;}
        int nl = vetor.length - 1;
		int[] v_1 = new int[nl];
        boolean removed = false;	
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] == n) {
                removed = true;
                continue;
            }
            if(removed == false) {
                v_1[i] = vetor[i];
            } else {
                v_1[i-1] = vetor[i];
            }
        }
        vetor = v_1;
    }

    public void empty() {
		vetor = new int[0];
	}
	
	public int size() {
		return vetor.length;
	}

    @Override
	public String toString() {
		String s = "";
		for(int n : vetor) {
			s += n + " ";
		}
		return s;
	}

    public Conjunto combine(Conjunto add){
        Conjunto result = new Conjunto();
        result = this;
        for (int i = 0;i<add.size();i++){
            int c = add.getVetor()[i];
            if (!this.contains(c)) {
                result.insert(c);
            }
        }
        return result;
    }

    public Conjunto subtract(Conjunto dif){
        Conjunto result = new Conjunto();
        result = this;
        for (int i = 0;i<dif.size();i++){
            int c = dif.getVetor()[i];
            if (this.contains(c)) {
                result.remove(c);
            }
        }
        return result;
    }

    public Conjunto intersect(Conjunto inter){
        Conjunto result = new Conjunto();
        for (int i = 0;i<inter.size();i++){
            int c = inter.getVetor()[i];
            if (this.contains(c)) {
                result.insert(c);
            }
        }
        return result;
    }
}
