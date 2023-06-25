package Aula5;

public class Triangle {
    private double l1, l2, l3;

    public Triangle() {
    }

    public Triangle(double l1, double l2, double l3) {
        assert l3 <= l1 + l2;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return this.l1;
    }

    public void setL1(double l1) {
        assert l1 <= l3 + l2;
        this.l1 = l1;
    }

    public double getL2() {
        return this.l2;
    }

    public void setL2(double l2) {
        assert l2 <= l1 + l3;
        this.l2 = l2;
    }

    public double getL3() {
        return this.l3;
    }

    public void setL3(double l3) {
        assert l3 <= l2 + l1;
        this.l3 = l3;
    }

    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return l1 == triangle.l1 && l2 == triangle.l2 && l3 == triangle.l3;
    }

    public double perimetro() {
        return l1 + l2 + l3;
    }

    @Override
    public String toString() {
        return "Trianlge defined by l1 = " + l1 + ", l2 = " + l2 + ", l3 = " + l3;
    }
}
