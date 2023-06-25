package Aula5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection, selection2, mainselection;
        Double input, input2, input3;
        Triangle[] triangleTest = new Triangle[2];
        Circle[] circleTest = new Circle[2];
        Rectangle[] rectangleTest = new Rectangle[2];

        do {
            menu();
            mainselection = sc.nextInt();
            switch (mainselection) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < triangleTest.length; i++) {
                        if (triangleTest[i] == null) {
                            System.out.println("Side 1?");
                            input = sc.nextDouble();
                            System.out.println("Side 2?");
                            input2 = sc.nextDouble();
                            System.out.println("Side 3?");
                            input3 = sc.nextDouble();
                            triangleTest[i] = new Triangle(input, input2, input3);
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < rectangleTest.length; i++) {
                        if (rectangleTest[i] == null) {
                            System.out.println("Height?");
                            input = sc.nextDouble();
                            System.out.println("Length?");
                            input2 = sc.nextDouble();
                            rectangleTest[i] = new Rectangle(input, input2);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < circleTest.length; i++) {
                        if (circleTest[i] == null) {
                            System.out.println("Radius?");
                            input = sc.nextDouble();
                            circleTest[i] = new Circle(input);
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < triangleTest.length && triangleTest[i] != null; i++) {
                        System.out.printf("Triangle %s -> %s\n", i + 1, triangleTest[i].toString());
                    }
                    for (int i = 0; i < rectangleTest.length && rectangleTest[i] != null; i++) {
                        System.out.printf("Rectangle %s -> %s\n", i + 1, rectangleTest[i].toString());
                    }
                    for (int i = 0; i < circleTest.length && circleTest[i] != null; i++) {
                        System.out.printf("Circle %s -> %s\n", i + 1, circleTest[i].toString());
                    }
                    break;
                case 5:
                    System.out.println("Select the shape:\n1 - triangle\n2 - rectangle\n3 - circle");
                    selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            assert triangleTest.length > 0;
                            for (int i = 0; i < triangleTest.length && triangleTest[i] != null; i++) {
                                System.out.printf("Triangle %s -> %s\n", i + 1, triangleTest[i].toString());
                            }
                            System.out.println("Which triangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(triangleTest[selection].perimetro());
                            break;
                        case 2:
                            assert rectangleTest.length > 0;
                            for (int i = 0; i < rectangleTest.length && rectangleTest[i] != null; i++) {
                                System.out.printf("Rectangle %s -> %s\n", i + 1, rectangleTest[i].toString());
                            }
                            System.out.println("Which rectangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(rectangleTest[selection].perimetro());
                            break;
                        case 3:
                            assert circleTest.length > 0;
                            for (int i = 0; i < circleTest.length && circleTest[i] != null; i++) {
                                System.out.printf("Circle %s -> %s\n", i + 1, circleTest[i].toString());
                            }
                            System.out.println("Which circle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(circleTest[selection].perimetro());
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Select the shape:\n1 - triangle\n2 - rectangle\n3 - circle");
                    selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            assert triangleTest.length > 0;
                            for (int i = 0; i < triangleTest.length && triangleTest[i] != null; i++) {
                                System.out.printf("Triangle %s -> %s\n", i + 1, triangleTest[i].toString());
                            }
                            System.out.println("Which triangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(triangleTest[selection].area());
                            break;
                        case 2:
                            assert rectangleTest.length > 0;
                            for (int i = 0; i < rectangleTest.length && rectangleTest[i] != null; i++) {
                                System.out.printf("Rectangle %s -> %s\n", i + 1, rectangleTest[i].toString());
                            }
                            System.out.println("Which rectangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(rectangleTest[selection].area());
                            break;
                        case 3:
                            assert circleTest.length > 0;
                            for (int i = 0; i < circleTest.length && circleTest[i] != null; i++) {
                                System.out.printf("Circle %s -> %s\n", i + 1, circleTest[i].toString());
                            }
                            System.out.println("Which circle?");
                            selection = sc.nextInt() - 1;
                            System.out.println(circleTest[selection].area());
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;

                case 7:
                    System.out.println("Select the shape:\n1 - triangle\n2 - rectangle\n3 - circle");
                    selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            assert triangleTest.length > 0;
                            for (int i = 0; i < triangleTest.length && triangleTest[i] != null; i++) {
                                System.out.printf("Triangle %s -> %s\n", i + 1, triangleTest[i].toString());
                            }
                            System.out.println("First triangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println("Second triangle?");
                            selection2 = sc.nextInt() - 1;
                            System.out.println(triangleTest[selection].equals(triangleTest[selection2]));
                            break;
                        case 2:
                            assert rectangleTest.length > 0;
                            for (int i = 0; i < rectangleTest.length && rectangleTest[i] != null; i++) {
                                System.out.printf("Rectangle %s -> %s\n", i + 1, rectangleTest[i].toString());
                            }
                            System.out.println("First rectangle?");
                            selection = sc.nextInt() - 1;
                            System.out.println("Second rectangle?");
                            selection2 = sc.nextInt() - 1;
                            System.out.println(rectangleTest[selection].equals(rectangleTest[selection2]));
                            break;
                        case 3:
                            assert circleTest.length > 0;
                            for (int i = 0; i < circleTest.length && circleTest[i] != null; i++) {
                                System.out.printf("Circle %s -> %s\n", i + 1, circleTest[i].toString());
                            }
                            System.out.println("First circle?");
                            selection = sc.nextInt() - 1;
                            System.out.println("Second circle?");
                            selection2 = sc.nextInt() - 1;
                            System.out.println(circleTest[selection].equals(circleTest[selection2]));
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;
                default:
                    System.out.println("Input is not a option.");
                    break;
            }
        } while (mainselection != 0);
        sc.close();

    }

    public static void menu() {
        System.out.println("Operations:");
        System.out.println("1 - create new triangle");
        System.out.println("2 - create new rectangle");
        System.out.println("3 - create new circle");
        System.out.println("4 - show created shapes");
        System.out.println("5 - show shape perimeter");
        System.out.println("6 - show shape area");
        System.out.println("7 - show equality");
        System.out.println("0 - exit");
    }
}
