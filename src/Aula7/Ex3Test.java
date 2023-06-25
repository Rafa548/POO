package Aula7;

import java.util.Scanner;

public class Ex3Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, selection;
        Agencia agencia = new Agencia("Agencia de Teste", "Rua Teste, 1");

        do {
            menu();
            input = sc.nextInt();
            switch (input) {
                case 0:
                    break;

                case 1:
                    System.out.println("(0) Apartamento \n(1) Quarto");
                    selection = sc.nextInt();
                    System.out.println("Codigo?");
                    String codigo = sc.next();
                    System.out.println("Nome?");
                    String nome = sc.next();
                    System.out.println("Local?");
                    String local = sc.next();
                    System.out.println("Price?");
                    double price = sc.nextDouble();
                    System.out.println("Rating?");
                    double rating = sc.nextDouble();
                    if (selection == 0) {
                        System.out.println("Rooms?");
                        int rooms = sc.nextInt();
                        agencia.addAlojamento(codigo, nome, local, price, rating, rooms);
                    } else {
                        System.out.println("Type?");
                        String type = sc.next();
                        agencia.addAlojamento(codigo, nome, local, price, rating, type);
                    }
                    break;

                case 2:
                    System.out.println("Classe");
                    char classe = sc.next().charAt(0);
                    System.out.println("Type?");
                    String type = sc.next();
                    agencia.addViatura(classe, type);
                    break;

                case 3:
                    System.out.println(agencia.listAlojamentos());
                    break;

                case 4:
                    System.out.println(agencia.listViaturas());
                    break;

                case 5:
                    System.out.println(agencia.listAlojamentos());
                    System.out.println("Index?");
                    int codigo2 = sc.nextInt();
                    agencia.removeAlojamento(codigo2);
                    break;

                case 6:
                    System.out.println(agencia.listViaturas());
                    System.out.println("Index?");
                    int index = sc.nextInt();
                    agencia.removeViatura(index);
                    break;

                case 7:
                    System.out.println("Qual Alojamento a reservar?");
                    System.out.println(agencia.listAlojamentos());
                    int index2 = sc.nextInt();
                    if (agencia.checkin(index2)) {
                        System.out.println("Checkin realizado com sucesso!");
                    } else {
                        System.out.println("Checkin não realizado!");
                    }
                    break;

                case 8:
                    System.out.println("Qual Alojamento a cancelar?");
                    System.out.println(agencia.listAlojamentos());
                    int index3 = sc.nextInt();
                    if (agencia.checkout(index3)) {
                        System.out.println("Checkout realizado com sucesso!");
                    } else {
                        System.out.println("Checkout não realizado!");
                    }
                    break;

                case 9:
                    System.out.println("Qual Veiculo a reservar?");
                    System.out.println(agencia.listViaturas());
                    int index4 = sc.nextInt();
                    if (agencia.vehicleCheckin(index4)) {
                        System.out.println("Checkin realizado com sucesso!");
                    } else {
                        System.out.println("Checkin não realizado!");
                    }
                    break;

                case 10:
                    System.out.println("Qual Veiculo a retornar?");
                    System.out.println(agencia.listViaturas());
                    int index5 = sc.nextInt();
                    if (agencia.vehicleCheckout(index5)) {
                        System.out.println("Checkout realizado com sucesso!");
                    } else {
                        System.out.println("Checkout não realizado!");
                    }
                    break;
                
                default:
                        System.out.println("Opção inválida!");
            }
        } while (input != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("Angency operations:");
        System.out.println("1 - Add new accommodation");
        System.out.println("2 - Add new vehicle");
        System.out.println("3 - Show all accommodations");
        System.out.println("4 - Show all vehicles");
        System.out.println("5 - Remove accommodation");
        System.out.println("6 - Remove vehicle");
        System.out.println("7 - Check in");
        System.out.println("8 - Check out");
        System.out.println("9 - Checkin a vehicle");
        System.out.println("10 - Checkout a vehicle");
        System.out.println("0 - exit");
    }
}
