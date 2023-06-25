package Aula7;

public class Circle extends Forma {
    private double raio;

    public Circle() {
    }

    public Circle(Double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public Circle(Double raio, String cor) {
        if (raio > 0) {
            this.raio = raio;
            this.cor = cor;
        }
    }

    public double getRaio() {
        return this.raio;
    }
    
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double area() {
        return raio * raio * Math.PI;
    }

    public double perimetro() {
        return Math.PI * raio * 2;
    }

    @Override
    public String toString() {
        return "Circle with a " + getRaio() + " cm radius" + ", cor = " + cor +".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return (raio == circle.raio && cor.equals(circle.cor));
    }
}