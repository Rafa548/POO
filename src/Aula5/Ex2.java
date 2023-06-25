package Aula5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, dia, mes, ano;
        Calendar calendarTest = null;
        do {
            menu();
            input = sc.nextInt();
            switch (input) {
                case 0:
                    break;
                case 1:
                    System.out.println("Primeiro dia do ano?");
                    dia = sc.nextInt();
                    System.out.println("Ano?");
                    ano = sc.nextInt();
                    calendarTest = new Calendar(dia, ano);
                    break;
                case 2:
                    if (calendarTest == null) {
                        System.out.println("Calendar not created");
                        break;
                    }
                    System.out.println("Mes?");
                    mes = sc.nextInt();
                    calendarTest.printMonth(mes);
                    break;
                case 3:
                    if (calendarTest == null) {
                        System.out.println("Calendar not created");
                        break;
                    }
                    System.out.println(calendarTest.toString());
                    break;
                default:
                    System.out.println("Input is not a option.");
                    break;
            }
        } while (input != 0);
        sc.close();

    }

    public static void menu() {
        System.out.println("Calendar operations:");
        System.out.println("1 - create new calendar");
        System.out.println("2 - print calendar month");
        System.out.println("3 - print calendar");
        System.out.println("0 - exit");
    }
}
