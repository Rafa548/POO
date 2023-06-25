package Aula5;

public class Utilizador {
    private String nome, curso;
    private int nMec;
    private int[] bookIds = new int[3];

    public Utilizador() {
    }

    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.nMec = nMec;
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getbookIDs() {
        return this.bookIds;
    }

    public int[] setbookIDs(int[] bookIds) {
        return this.bookIds = bookIds;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getnMec() {
        return this.nMec;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public boolean addBook(int bookId) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i] == 0) {
                bookIds[i] = bookId;
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(int bookId) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i] == bookId) {
                bookIds[i] = 0;
                return true;
            }
        }
        return false;
    }

    public int userSpace() {
        int space = 0;
        for (int i = 0; i < this.bookIds.length; i++) {
            if (this.bookIds[i] == 0) {
                space += 1;
            }
        }
        return space;
    }

    @Override
    public String toString() {
        return "Aluno: " + nMec + "; " + nome + "; " + curso;
    }
}