package Aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double cl, far;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a Temperatura em graus Célcius: ");
        cl = sc.nextDouble();
        far =  1.8*cl + 32;
        System.out.println("A Temperatura em graus Fahrenheit " + far);
        sc.close();
    }
}
