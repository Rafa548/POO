package Aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double v1, d1, v2, d2, vf;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira velocidade em km/h: (1 percurso): ");
        v1 = sc.nextDouble();
        System.out.print("Insira distância em km: (1 percurso): ");
        d1 = sc.nextDouble();
        System.out.print("Insira velocidade em km/h: (2 percurso): ");
        v2 = sc.nextDouble();
        System.out.print("Insira distância em km: (2 percurso): ");
        d2 = sc.nextDouble();
        vf = ((v1/d1)+(v2/d2))/2;
        System.out.println("A velocidade média final é " + vf);
        sc.close();
    }
}
