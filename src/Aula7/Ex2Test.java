package Aula7;

import java.util.Scanner;

public class Ex2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, dia, mes, ano, selection;
        Date[] dateTest = new Date[100];

        do {
            menu();
            input = sc.nextInt();
            switch (input) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < dateTest.length; i++) {
                        if (dateTest[i] == null) {
                            System.out.println("(0) Data normal \n(1) Dias desde 1/1/2000");
                            selection = sc.nextInt();
                            switch (selection) {
                                case 0:
                                    System.out.println("Dia da data?");
                                    dia = sc.nextInt();
                                    System.out.println("Mes da data?");
                                    mes = sc.nextInt();
                                    System.out.println("Ano da data?");
                                    ano = sc.nextInt();
                                    dateTest[i] = new DateYMD(dia, mes, ano);
                                    break;
                                case 1:
                                    System.out.println("Dia da data?");
                                    dia = sc.nextInt();
                                    System.out.println("Mes da data?");
                                    mes = sc.nextInt();
                                    System.out.println("Ano da data?");
                                    ano = sc.nextInt();
                                    dateTest[i] = new DateND(dia, mes, ano);
                                    break;

                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    if (dateTest[0] == null) {
                        System.out.println("Date not created");
                        break;
                    }
                    for (int i = 0; dateTest[i] != null; i++) {
                        System.out.printf("Date %s -> %s\n", i + 1, dateTest[i].toString());
                    }
                    break;
                case 3:
                    if (dateTest[0] == null) {
                        System.out.println("Date not created");
                        break;
                    }
                    for (int i = 0; dateTest[i] != null; i++) {
                        System.out.printf("Date %s -> %s\n", i + 1, dateTest[i].toString());
                    }
                    System.out.println("Which date to increment?");
                    selection = sc.nextInt() - 1;
                    dateTest[selection].increment();
                    System.out.println(dateTest[selection].toString());
                    break;
                case 4:
                    if (dateTest[0] == null) {
                        System.out.println("Date not created");
                        break;
                    }
                    for (int i = 0; dateTest[i] != null; i++) {
                        System.out.printf("Date %s -> %s\n", i + 1, dateTest[i].toString());
                    }
                    System.out.println("Which date to decrement?");
                    selection = sc.nextInt() - 1;
                    dateTest[selection].decrement();
                    System.out.println(dateTest[selection].toString());
                    break;
                default:
                    System.out.println("Input is not a option.");
                    break;
            }
        } while (input != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("Date operations:");
        System.out.println("1 - create new date");
        System.out.println("2 - show current date");
        System.out.println("3 - increment date");
        System.out.println("4 - decrement date");
        System.out.println("0 - exit");
    }
}
