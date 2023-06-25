package Aula05.Ex4;

public class Livro {
    private static int idCount = 100;
    private int id;
    private String titulo;
    private String tipoEmprestimo; // CONDICIONAL OU NORMAL

    public Livro(String title, String tipoEmp) {
        this.titulo = title;
        this.tipoEmprestimo = tipoEmp;
        this.id = idCount;
        Livro.idCount++;
    }

    public Livro(String title) {
        this.titulo = title;
        this.tipoEmprestimo = "NORMAL";
        this.id = idCount;
        Livro.idCount++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    @Override
    public String toString() {
        return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
    }

    public void setTitulo(String newTitle) {
        this.titulo = newTitle;
    }

    public void setTipoEmprestimo(String newTipoEmprestimo) {
        this.tipoEmprestimo = newTipoEmprestimo;
    }
}
