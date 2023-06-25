package Aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        double Ti, Tf, M, Q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de Água (Kg): ");
        M = sc.nextDouble();
        System.out.print("Temperatura Inicial (Graus Celcius): ");
        Ti = sc.nextDouble();
        System.out.print("Temperatura Final (Graus Celcius): ");
        Tf = sc.nextDouble();
        Q = M * (Tf-Ti) * 4184;
        System.out.println("A Energia necessária é " + Q);
        sc.close();

    }
}
