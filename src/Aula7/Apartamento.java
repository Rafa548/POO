package Aula7;

public class Apartamento extends Alojamento {
    private int rooms;

    public Apartamento(String codigo, String nome, String local, double price, double rating, int rooms) {
        if (valid(rating)) {
            this.rooms = rooms;
            this.codigo = codigo;
            this.nome = nome;
            this.local = local;
            this.price = price;
            this.available = true;
            this.rating = rating;
            this.rooms = rooms;
        }
    }

    private boolean valid(double rating) {
        if (rating >= 1 && rating <= 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkin() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkout() {
        if (available) {
            return false;
        } else {
            available = true;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Apartamento{" + "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", price=" + price + ", available=" + available + ", rating=" + rating + ", rooms=" + rooms + '}';
    }


}
