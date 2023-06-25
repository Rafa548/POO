package Aula7;

public class Carro extends Viatura {
    private char classe;
    private String type;

    public Carro(char classe, String type) {
        //class is a char from A to F

        if (valid(classe)) {
            this.classe = classe;
            this.type = type;
            this.available = true;
        }
    }
    
    private boolean valid(char classe) {
        if (classe >= 'A' && classe <= 'F') {
            return true;
        } else {
            return false;
        }
    }

    public char getClasse() {
        return classe;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean levantar() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean entregar() {
        if (available) {
            return false;
        } else {
            available = true;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "classe=" + classe + ", type=" + type + ", available=" + available + '}';
    }
    
}
