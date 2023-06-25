package Treino20202021;

import java.util.Collection;

public class Atividade implements PontosdeInteresse{
    private int id;
    private String name;

    public Atividade(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Atividade other = (Atividade) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getNome() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    @Override
    public Collection<String> locais() {
        return null;
    }

    public String toString() {
        return "Atividade " + "[" + "num=" + this.getId() + ", nome=" + this.getNome()+ "]";
    }

}
