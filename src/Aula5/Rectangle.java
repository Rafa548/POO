package Aula5;

public class Rectangle {
    private double height, length;

    public Rectangle() {
    }

    public Rectangle(double height, double length) {
        assert height > 0 && length > 0;
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        assert height > 0;
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        assert length > 0;
        this.length = length;
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
        return height == rectangle.height && length == rectangle.length;
    }

    @Override
    public String toString() {
        return "Rectangle defined by height = " + height + " and length = " + length;
    }

}
