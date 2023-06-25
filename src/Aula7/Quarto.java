package Aula7;

public class Quarto extends Alojamento {
    
    private String type;


    public Quarto(String codigo, String nome, String local, double price, double rating, String type) {
        if(valid(type, rating)){
            this.type = type;
            this.codigo = codigo;
            this.nome = nome;
            this.local = local;
            this.price = price;
            this.available = true;
            this.rating = rating;
        }
    }

    private boolean valid(String type, double rating) {
        if(type.equals("Single") || type.equals("Double") || type.equals("Twin") || type.equals("Triple")){
            if(rating >= 1 && rating <= 5){
                return true;
            }else{
                return false;
            }
        }else{
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
        return "Quarto{" + "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", price=" + price + ", available=" + available + ", rating=" + rating + ", type=" + type + '}';
    }

}
