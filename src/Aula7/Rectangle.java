package Aula7;

public class Rectangle extends Forma {
    private double height, length;

    public Rectangle() {
    }

    public Rectangle(double height, double length) {
        if(height > 0 && length > 0) {
            this.height = height;
            this.length = length;
        }
    }

    public Rectangle(double height, double length, String cor) {
        if(height > 0 && length > 0) {
            this.height = height;
            this.length = length;
            this.cor = cor;
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if(length > 0) {
            this.length = length;
        }
    }

    public double perimetro() {
        return height * 2 + length * 2;
    }

    public double area() {
        return height * length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return (area() == rectangle.area() && cor.equals(rectangle.cor) && perimetro() == rectangle.perimetro());
    }

    @Override
    public String toString() {
        return "Rectangle defined by height = " + height + " and length = " + length + ", cor = " + cor+".";
    }

}
