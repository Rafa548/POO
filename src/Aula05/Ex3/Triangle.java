package Aula05.Ex3;

import java.util.Arrays;

public class Triangle {
    private double side1;
    private double side2;
    private double hypot;

    public Triangle(double a, double b, double c) {
        double[] sides = {a, b, c};
        Arrays.sort(sides);
        this.hypot = sides[0];
        this.side1 = sides[1];
        this.side2 = sides[2];
    }

    public double getHypot() {
        return hypot;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public String toString() {
        return "Hypotenuse = " + hypot + "; sides = " + side1 + ", " + side2;
    }

    public boolean equals(Triangle otherTriangle) {
        double[] sides = {hypot, side1, side2};
        double[] otherSides = {otherTriangle.getHypot(), otherTriangle.getSide1(), otherTriangle.getSide2()};

        Arrays.sort(sides);
        Arrays.sort(otherSides);

        for (int i = 0; i < sides.length; i++) {
            if(sides[i] != otherSides[i]) {
                return false;
            }
        }
        return true;
    }

    public void setHypot(double newHypot) {
        this.hypot = newHypot;
    }

    public void setSide1(double newSide1) {
        this.side1 = newSide1;
    } 

    public void setSide2(double newSide2) {
        this.side2 = newSide2;
    }

    public double perimeter() {
        return hypot + side1 + side2;
    }

    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p * (p - hypot) * (p - side1) * (p - side2));
    }
}
