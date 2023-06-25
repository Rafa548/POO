package Aula05.Ex4;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;

    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getNMec() {
        return nMec;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nMec + "; " + nome + "; " + curso;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setNMec(int newNMec) {
        this.nMec = newNMec;
    }

    public void setCurso(String newCurso) {
        this.curso = newCurso;
    }
}
