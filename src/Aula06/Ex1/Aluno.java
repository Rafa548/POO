package Aula06.Ex1;

public class Aluno extends Pessoa {
    private Date Data_i;
    private int N_Mec;
    private static int contador = 100;

    public Aluno(String Nome, int cc, Date DataNasc, Date DataInsc){
        super(Nome, cc, DataNasc);
        this.Data_i = DataInsc;
        this.N_Mec = contador++;
    }
    public Aluno(String Nome, int cc, Date DataNasc){
        super(Nome, cc, DataNasc);
        this.N_Mec = contador++;
        this.Data_i = Date.today();
    }

    public Date getDataI(){
        return Data_i;
    }

    public int getNMec(){
        return N_Mec;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.getNome() + "; " + N_Mec + "; " + Data_i;
    }
}
