package Aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double J, F1, F2, F3, I;
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido: ");
        I = sc.nextDouble();
        System.out.print("Taxa Mensal: ");
        J = sc.nextDouble();
        F1 = (I * J)/100 + I;
        F2 = (F1 * J)/100 + F1;
        F3 = (F2 * J)/100 + F2;
        System.out.println("Ao fim de 3 meses tem: " + F3);
        sc.close();

    }
}
