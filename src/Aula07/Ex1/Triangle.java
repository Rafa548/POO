package Aula07.Ex1;

public class Triangle {
    private float side1;
    private float side2;
    private float side3;
    private String color;

    Triangle(float s1, float s2, float s3,String c) {
        if (s1 > 0 && s2 > 0 && s3 > 0) {
            if ((s1 + s2 >= s3) && (s2 + s3 >= s1) && (s1 + s3 >= s2)) {
                side1 = s1;
                side2 = s2;
                side3 = s3;
                color = c;
            }
        }
    }

    Triangle() {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide1(float s1) {
        if (s1 > 0) {
            if (side2 + side3 >= side1) {
                side1 = s1;
            }
        }
    }

    public void setSide2(float s2) {
        if (s2 > 0) {
            if (side1 + side3 >= s2) {
                side2 = s2;
            }
        }    
    }

    public void setSide3(float s3) {
        if (s3 > 0) {
            if (side1 + side2 >= s3) {
                side3 = s3;
            }
        }    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String x) {
        color = x;
    }

    public boolean equals(Triangle trian2) {
        return ((this.side1 == trian2.getSide1()) && (this.side2 == trian2.getSide2()) && (this.side3 == trian2.getSide3()) && (this.color == trian2.getColor()));
    }

    public String toString() {
        String s = String.format("Side 1: %s; Side 2: %s; Side 3: %s; Color: %s", side1, side2, side3,color);
        return s;
    }
    
    public double area() {
        float p = (side1 + side2 + side3)/2;
        System.out.println(p);
        return (float)Math.pow((p * (p - side1) * (p - side2) * (p - side3)), 0.5);
    }
    
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
