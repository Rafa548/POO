package Aula06.Ex1;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc) {
        if (V_cc(cc) == true & V_nome(nome) == false){
            this.nome = nome;
            this.cc = cc;
            this.dataNasc = dataNasc;
        }
        else{
            System.out.println("Nome ou CC (Inválido)");
        }
        
    }

    public String getNome(){
        return nome;
    }

    public int getCc(){
        return cc;
    }

    public Date getDataNasc(){
        return dataNasc;
    }

    public boolean V_cc(int cc) {
        String cc_s = Integer.toString(cc);
        if (cc_s.length() > 1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean V_nome(String nome) {
        boolean x = nome.matches(".*[0-9].*");
        return x;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cc != other.cc)
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cc;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

    @Override
    public String toString() {
        return "Pessoa: " + nome + "; " + cc + "; " + dataNasc;
    }

    
}
