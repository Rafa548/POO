package Aula2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double Celsius, Fahreinheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature in Celsius? ");
        Celsius = sc.nextDouble();
        sc.close();
        Fahreinheit = 1.8 * Celsius + 32;
        System.out.println(Celsius + " ºC = " + Fahreinheit + " ºF");
    }
}
