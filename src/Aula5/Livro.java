package Aula5;

public class Livro {
    private int id;
    private String titulo, tipoEmprestimo;
    private static int lastID = 100;

    public Livro(){
    }
    
    public Livro(String titulo){
        this.id = lastID;
        this.titulo = titulo;
        this.tipoEmprestimo = "NORMAL";
        lastID += 1;
    }

    public Livro(String titulo, String tipoEmprestimo){
        this.id = lastID;
        this.tipoEmprestimo = tipoEmprestimo;
        this.titulo = titulo;
        lastID += 1;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoEmprestimo() {
        return this.tipoEmprestimo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
    
    public boolean available(){
        if(tipoEmprestimo.equals("NORMAL")){
            return true;
        }
        return false;
    }
    
    public void changetoAvailable(){
        System.out.println("Im here");
        System.out.println(this.tipoEmprestimo);
        this.tipoEmprestimo = "NORMAL";
        System.out.println(this.tipoEmprestimo);
    }

    public void changetoUnavailable(){
        this.tipoEmprestimo = "CONDICIONAL";
    }

    @Override
    public String toString(){
        return "Livro " + id + "; " + titulo +"; " + tipoEmprestimo;
    }
}
