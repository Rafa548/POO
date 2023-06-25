package Aula5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utilizador[] userList = new Utilizador[100];
        Livro[] bookList = new Livro[100];
        String stringInput, stringInput2;
        int selection, intInput, intInput2, nMec, id;
        do {
            menu();
            selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1:
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] == null) {
                            System.out.println("Nome?");
                            stringInput = sc.nextLine();
                            System.out.println("Numero mecanografico?");
                            intInput = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Curso?");
                            stringInput2 = sc.nextLine();
                            userList[i] = new Utilizador(stringInput, intInput, stringInput2);
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null) {
                            System.out.println(userList[i]);
                        }
                    }
                    System.out.println("Numero mecanográfico do utilizador?");
                    intInput = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null && userList[i].getnMec() == intInput) {
                            userList[i] = null;
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Utilizador não foi encontrado.");
                    break;

                case 3:
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null) {
                            System.out.println(userList[i]);
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < bookList.length; i++) {
                        if (bookList[i] == null) {
                            System.out.println("Titulo?");
                            stringInput = sc.nextLine();
                            System.out.println("Tipo Emprestimo?");
                            stringInput2 = sc.nextLine();
                            bookList[i] = new Livro(stringInput, stringInput2);
                            break;
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < bookList.length; i++) {
                        if (bookList[i] != null) {
                            System.out.println(bookList[i]);
                        }
                    }
                    break;

                case 6:
                    intInput = -1;
                    intInput2 = -1;
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null) {
                            System.out.println(userList[i]);
                        }
                    }
                    System.out.println("Numero mecanografico do utilizador?");
                    nMec = sc.nextInt();
                    for (int i = 0; i < bookList.length; i++) {
                        if (bookList[i] != null) {
                            System.out.println(bookList[i]);
                        }
                    }
                    System.out.println("Id do livro?");
                    id = sc.nextInt();

                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null && userList[i].getnMec() == nMec) {
                            intInput = i;
                        }
                    }

                    for (int i = 0; i < bookList.length; i++) {
                        if (bookList[i] != null && bookList[i].getId() == id) {
                            intInput2 = i;
                        }
                    }
                    if (intInput2 == -1 || intInput == -1) {
                        System.out.println("Error id was not found.");
                    }

                    if (userList[intInput].userSpace() != 0 && bookList[intInput2].available()) {
                        userList[intInput].addBook(id);
                        bookList[intInput2].changetoUnavailable();
                    } else {
                        System.out.println("Operation ran into an error and was not completed.");
                    }
                    break;

                case 7:
                    intInput = -1;
                    intInput2 = -1;
                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null) {
                            System.out.println(userList[i]);
                        }
                    }
                    System.out.println("Numero mecanografico do utilizador?");
                    nMec = sc.nextInt();

                    for (int i = 0; i < userList.length; i++) {
                        if (userList[i] != null && userList[i].getnMec() == nMec) {
                            intInput = i;
                        }
                    }
                    System.out.println("IDs de livros em posso do utilizador:");
                    for (int i = 0; i < userList[intInput].getbookIDs().length; i++) {
                        if (userList[intInput].getbookIDs()[i] != 0) {
                            System.out.println(userList[intInput].getbookIDs()[i]);
                        }
                    }
                    System.out.println("Id do livro?");
                    id = sc.nextInt();

                    for (int i = 0; i < bookList.length; i++) {
                        if (bookList[i] != null && bookList[i].getId() == id) {
                            intInput2 = i;
                        }
                    }
                    if (intInput2 == -1 || intInput == -1) {
                        System.out.println("Error id was not found.");
                    }
                    if (!bookList[intInput2].available() && userList[intInput].userSpace() != 3) {
                        userList[intInput].removeBook(id);
                        bookList[intInput2].changetoAvailable();
                    }
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (selection != 8);
        sc.close();
    }

    public static void menu() {
        System.out.println("Operations:");
        System.out.println("1 - inscrever utilizador");
        System.out.println("2 - remover utilizador");
        System.out.println("3 - imprimir lista de utilizadores");
        System.out.println("4 - registar um novo livro");
        System.out.println("5 - imprimir lista de livros");
        System.out.println("6 - emprestar");
        System.out.println("7 - devolver");
        System.out.println("8 - exit");
    }
}
