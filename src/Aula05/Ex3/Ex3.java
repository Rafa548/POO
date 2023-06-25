package Aula05.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Testing...");

        System.out.println();

        System.out.println("Point testing");
        Point point1 = new Point(0, 0);
        System.out.println(point1);
        point1.setX(2);
        point1.setY(6);
        System.out.println(point1); 
        Point point2 = new Point(2, 6);
        System.out.println(point1.equals(point2)); // true
        Point point3 = new Point(3, 9);
        System.out.println(point1.equals(point3)); // false

        System.out.println();

        System.out.println("Circle testing");
        Circle circle1 = new Circle(2, 2, 3);
        System.out.println(circle1);
        circle1.setCenter(1, 1);
        circle1.setRadius(1);
        System.out.println(circle1);
        Circle circle2 = new Circle(5, 5, 2);
        System.out.println(circle1.equals(circle2)); // false
        Circle circle3 = new Circle(1, 1, 1);
        System.out.println(circle1.equals(circle3)); // true
        Circle circle4 = new Circle(4, 4, 2);
        System.out.println(circle1.intersect(circle2)); // false
        System.out.println(circle2.intersect(circle4)); // true

        System.out.println();

        System.out.println("Triangle testing");
        Triangle triangle1 = new Triangle(3, 3, 5);
        System.out.println(triangle1);
        triangle1.setHypot(6);
        triangle1.setSide1(4);
        triangle1.setSide1(4);
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle(4, 6, 4);
        System.out.println(triangle1.equals(triangle2)); // true
        Triangle triangle3 = new Triangle(2, 2, 3);
        System.out.println(triangle1.equals(triangle3)); // false

        System.out.println();

        System.out.println("Rectangle testing");
        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1);
        rectangle1.setHeight(2);
        rectangle1.setLength(3);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(3, 2);
        System.out.println(rectangle1.equals(rectangle2)); // true
        Rectangle rectangle3 = new Rectangle(4, 5);
        System.out.println(rectangle1.equals(rectangle3)); // false

        System.out.println();

        System.out.println("Testing ended");
    }
}
