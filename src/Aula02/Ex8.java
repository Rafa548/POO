package Aula02;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double c1, c2, h, ang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do cateto: (1) ");
        c1 = sc.nextDouble();
        System.out.print("Insira o valor do cateto: (2) ");
        c2 = sc.nextDouble();
        h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
        ang = (Math.atan(c2/c1)) * (180/Math.PI);
        System.out.println("O valor da hipotenusa é " + h + " e o valor do ângulo é " + ang);
        sc.close();
    }
}
