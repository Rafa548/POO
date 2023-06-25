package Aula2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double KM, MI;
        Scanner sc = new Scanner(System.in);
        System.out.print("KM? : ");
        KM = sc.nextDouble();
        sc.close();
        MI = KM/1.609;
        System.out.println(KM + " KM = " + MI + " Miles");
    }
}
