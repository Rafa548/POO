package Aula07.Ex1;
import java.lang.Math;

public class Circle extends Forma{
    private float radius;
    private String color;
    Circle (float radius,String color) {
        if (radius > 0) {
            this.radius = radius;
            this.color = color;
        }
    }
    
    Circle() {
        radius = 0;
    }

    public float getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String x) {
        color = x;
    }

    public void setRadius(float h) {
        if (h > 0) {
            radius = h;
        }
    }

    public String toString() {
        return "Radius: " + this.getRadius() + "," + this.getColor();
    }
    public boolean equals(Circle circle2) {
        return ((this.radius == circle2.getRadius()) && (this.color == circle2.getColor()));
    }
    public double area() {
        return Math.PI*radius*radius; 
    }
    
    public double perimeter() {
        return DOUBLE_PI*radius;
    }
}


