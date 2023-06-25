package Aula4;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, acronim = "";
        String[] arrString;
        System.out.println("Escreva uma frase:");
        input = sc.nextLine();
        sc.close();
        arrString = input.split(" ");
        for(int i = 0; i < arrString.length; i++){
            if(arrString[i].length() > 3){
                acronim += Character.toUpperCase(arrString[i].charAt(0));
            }
        }
        System.out.printf("Acrónimo: %s\n", acronim);
    }
}
