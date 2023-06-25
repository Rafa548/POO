package Aula5;

public class Circle {
    private double raio;

    public Circle() {
    }

    public Circle(Double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double getRaio() {
        return this.raio;
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
        return "Circle with a " + getRaio() + " cm radius.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return raio == circle.raio;
    }
}