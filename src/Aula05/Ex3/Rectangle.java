package Aula05.Ex3;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Length = " + length + ", Height = " + height;
    }

    public boolean equals(Rectangle otherRectangle) {
        return (length == otherRectangle.getLength() && height == otherRectangle.getHeight() || length == otherRectangle.getHeight() && height == otherRectangle.getLength());
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double perimeter() {
        return 2*length + 2*height;
    }

    public double area() {
        return height*length;
    }
}
