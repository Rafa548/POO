package Aula2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double Inv, Tax;
        int Months;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much of a initial investement? ");
        Inv = sc.nextDouble();
        System.out.print("Monthly tax (X%)? ");
        Tax = sc.nextDouble() / 100D;
        System.out.print("How many months? ");
        Months = sc.nextInt();
        sc.close();
        for(int i=1; i<=Months; i++) {
            Inv += Inv * Tax;
        }
        System.out.println("After " + Months + " months you'll have " + Inv + " Euros.");
    }
}
