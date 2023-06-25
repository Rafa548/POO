package Aula2;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Double A, B, C, G;
        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        A = sc.nextDouble();
        System.out.print("B : ");
        B = sc.nextDouble();
        sc.close();
        C = Math.sqrt(A*A + B*B);
        G = Math.acos(A/C) * (180/Math.PI);
        System.out.format("Hipotenuse e ângulo: %s e %.2f", C, G);
    }
}
