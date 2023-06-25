package Aula07.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        byte opt = 0;
        do {
            System.out.println("Polygon operations");
            System.out.println("1 - circles");
            System.out.println("2 - triangles");
            System.out.println("3 - rectangles");
            System.out.println("0 - exit");
            System.out.print("Option: ");
            opt = sc.nextByte();
            byte circleOpt = 0;
            byte rectOpt = 0;
            byte trianOpt = 0;
            switch (opt) {
                case (0):
                    break;
                case (1):
                    // circle operations
                    do {
                        System.out.println("Circle operations");
                        System.out.println("1 - define the characteristics of a circle");
                        System.out.println("2 - characteristics of a circle");
                        System.out.println("3 - check if the 2 circles are equal");
                        System.out.println("4 - area of a circle");
                        System.out.println("0 - exit");
                        System.out.print("Option: ");
                        circleOpt = sc.nextByte();
                        byte circlenum = 0;
                        switch (circleOpt) {
                            case (0):
                                break;
                            case (1):
                                System.out.print("Circle to change (1/2): ");
                                circlenum = sc.nextByte();
                                if (circlenum == 1) {
                                    System.out.print("Radius: ");
                                    circle1.setRadius(sc.nextFloat());
                                    System.out.print("Color: ");
                                    circle1.setColor(sc.next());
                                } else if (circlenum == 2) {
                                    System.out.print("Radius: ");
                                    circle2.setRadius(sc.nextFloat());
                                    System.out.print("Color: ");
                                    circle1.setColor(sc.next());
                                } else {
                                    System.out.println("ERROR: Circle not found.");
                                }
                                break;
                            case (2):
                                System.out.print("Circle to check (1/2): ");
                                byte circleCheck = sc.nextByte();
                                if (circleCheck == 1) {
                                    System.out.println(circle1.toString());
                                } else if (circleCheck == 2) {
                                    System.out.println(circle2.toString());
                                } else {
                                    System.out.println("ERROR: Circle not found.");
                                }
                                break;
                            case (3):
                                System.out.println(circle1.equals(circle2)? "Circles are equal." : "Circles are not equal.");
                                break;
                            case (4):
                                System.out.print("Circle to check (1/2): ");
                                byte circleArea = sc.nextByte();
                                if (circleArea == 1) {
                                    System.out.println("Area of circle " + circleArea + " : " + circle1.area());
                                } else if (circleArea == 2) {
                                    System.out.println("Area of circle " + circleArea + " : " + circle2.area());
                                } else {
                                    System.out.println("ERROR: Circle not found.");
                                }
                                break;
                        }
                    } while (circleOpt != 0);
                    break;
                case (2):
                    // triangle operations
                    do {
                        System.out.println("Triangle operations");
                        System.out.println("1 - define the characteristics of a triangle");
                        System.out.println("2 - characteristics of a triangle");
                        System.out.println("3 - check if the 2 triangles are equal");
                        System.out.println("4 - area of a triangle");
                        System.out.println("0 - exit");
                        System.out.print("Option: ");
                        trianOpt = sc.nextByte();
                        switch (trianOpt) {
                            case (0):
                                break;
                            case (1):
                                System.out.print("Triangle to change (1/2): ");
                                byte triannum = sc.nextByte();
                                if (triannum == 1) {
                                    System.out.print("Side 1: ");
                                    triangle1.setSide1(sc.nextFloat());
                                    System.out.print("Side 2: ");
                                    triangle1.setSide2(sc.nextFloat());
                                    System.out.print("Side 3: ");
                                    triangle1.setSide3(sc.nextFloat());
                                    System.out.print("Color: ");
                                    triangle1.setColor(sc.next());
                                } else if (triannum == 2) {
                                    System.out.print("Side 1: ");
                                    triangle2.setSide1(sc.nextFloat());
                                    System.out.print("Side 2: ");
                                    triangle2.setSide2(sc.nextFloat());
                                    System.out.print("Side 3: ");
                                    triangle2.setSide3(sc.nextFloat());
                                    System.out.print("Color: ");
                                    triangle1.setColor(sc.next());
                                } else {
                                    System.out.println("ERROR: Triangle not found.");
                                }
                                break;
                            case (2):
                                System.out.print("Triangle to check (1/2): ");
                                byte triangleCheck = sc.nextByte();
                                if (triangleCheck == 1) {
                                    System.out.println(triangle1.toString());
                                } else if (triangleCheck == 2) {
                                    System.out.println(triangle2.toString());
                                } else {
                                    System.out.println("ERROR: Triangle not found.");
                                }
                                break;
                            case (3):
                                System.out.println(triangle1.equals(triangle2)? "Triangles are equal." : "Triangles are not equal.");
                                break;
                            case (4):
                                System.out.print("Triangle to check (1/2): ");
                                byte triangleArea = sc.nextByte();
                                if (triangleArea == 1) {
                                    System.out.println("Area of Triangle " + triangleArea + " : " + triangle1.area());
                                } else if (triangleArea == 2) {
                                    System.out.println("Area of Triangle " + triangleArea + " : " + triangle2.area());
                                } else {
                                    System.out.println("ERROR: Triangle not found.");
                                }
                                break;
                        }
                    } while (trianOpt != 0);
                    break;
                case(3):
                    // rectangle operations
                    do {
                        System.out.println("Rectangle operations");
                        System.out.println("1 - define the characteristics of a rectangle");
                        System.out.println("2 - characteristics of a rectangle");
                        System.out.println("3 - check if the 2 rectangles are equal");
                        System.out.println("4 - area of a rectangles");
                        System.out.println("0 - exit");
                        System.out.print("Option: ");
                        rectOpt = sc.nextByte();
                        switch (rectOpt) {
                            case (0):
                                break;
                            case (1):
                                System.out.print("Rectangle to change (1/2): ");
                                byte rectNum = sc.nextByte();
                                if (rectNum == 1) {
                                    System.out.print("Height: ");
                                    rectangle1.setHeight(sc.nextFloat());
                                    System.out.print("Width: ");
                                    rectangle1.setWidth(sc.nextFloat());
                                    System.out.print("Color: ");
                                    rectangle1.setColor(sc.next());
                                } else if (rectNum == 2) {
                                    System.out.print("Height: ");
                                    rectangle2.setHeight(sc.nextFloat());
                                    System.out.print("Width: ");
                                    rectangle2.setWidth(sc.nextFloat());
                                    System.out.print("Color: ");
                                    rectangle1.setColor(sc.next());
                                } else {
                                    System.out.println("ERROR: Rectangle not found.");
                                }
                                break;
                            case (2):
                                System.out.print("Rectangle to check (1/2): ");
                                byte rectangleCheck = sc.nextByte();
                                if (rectangleCheck == 1) {
                                    System.out.println(rectangle1.toString());
                                } else if (rectangleCheck == 2) {
                                    System.out.println(rectangle2.toString());
                                } else {
                                    System.out.println("ERROR: Rectangle not found.");
                                }
                                break;
                            case (3):
                                System.out.println(rectangle1.equals(rectangle2)? "Rectangles are equal." : "Rectangles are not equal.");
                                break;
                            case (4):
                                System.out.print("Rectangle to check (1/2): ");
                                byte rectangleArea = sc.nextByte();
                                if (rectangleArea == 1) {
                                    System.out.println("Area of Rectangle " + rectangleArea + " : " + rectangle1.area());
                                } else if (rectangleArea == 2) {
                                    System.out.println("Area of Rectangle " + rectangleArea + " : " + rectangle2.area());
                                } else {
                                    System.out.println("ERROR: Rectangle not found.");
                                }
                                break;
                        }
                    } while (rectOpt != 0);
                    break;
            }
        } while (opt != 0);
        sc.close();
    }
    
}
