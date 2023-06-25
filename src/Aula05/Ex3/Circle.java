package Aula05.Ex3;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Center = " + center + ", Radius = " + radius;
    }

    public boolean equals(Circle otherCircle) {
        return center.equals(otherCircle.getCenter()) && radius == otherCircle.getRadius();
    }

    public void setCenter(double x, double y) {
        center = new Point(x, y);
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean intersect(Circle otherCircle) {
        double d = Math.sqrt(Math.pow(this.getCenter().getX() - otherCircle.getCenter().getX(), 2) + Math.pow(this.getCenter().getY() - otherCircle.getCenter().getY(), 2));
        double r = this.getRadius() + otherCircle.getRadius();
        return d < r;
    }
}
