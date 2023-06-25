package Aula11;

public class Cidades implements Comparable<Cidades> {
    private String cidade;
    private int voosToCity;

    public Cidades(String cidade) {
        this.cidade = cidade;
        this.voosToCity = 1;
    }

    public String getCidade() {
        return cidade;
    }

    public void incrementVoosToCity() {
        this.voosToCity += 1;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getVoosToCity() {
        return voosToCity;
    }

    public void setVoosToCity(int voosToCity) {
        this.voosToCity = voosToCity;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-4s", this.cidade, this.voosToCity);
    }

    @Override
    public int compareTo(Cidades o) {
        Cidades d = (Cidades) o;
        if (this.voosToCity > d.voosToCity) {
            return 1;
        } else if (this.voosToCity < d.voosToCity) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        Cidades d = (Cidades) o;
        if (this.cidade.equals(d.cidade)) {
            return true;
        } else {
            return false;
        }
    }
}
