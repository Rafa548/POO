package Aula07.Ex1;


public class Rectangle extends Forma{
    private float height;
    private float width;
    private String color;

    Rectangle (float h, float w,String c) {
        if (h > 0 && w > 0) {
            this.height = h;
            this.width = w;
            this.color = c;
        }
    }

    Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public void setHeight(float h) {
        if (h > 0) {
            height = h;
        } else {
            System.out.println("ERROR: Height has to be a positive number.");
        }
    }

    public void setWidth(float w) {
        if (w > 0) {
            width = w;
        } else {
            System.out.println("ERROR: Width has to be a positive number.");
        }
    }
    
    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String x) {
        color = x;
    }

    public boolean equals(Rectangle rect2) {
        return ((this.height == rect2.getHeight()) && (this.width == rect2.getWidth()) && (this.color == rect2.getColor()));
    }

    public String toString() {
        return "Height: " + height + "; Width: " + width + "Color: " + this.getColor();
    }

    public double area() {
        return height*width; 
    }
    
    public double perimeter() {
        return height*2 + width*2;
    }
    
}
