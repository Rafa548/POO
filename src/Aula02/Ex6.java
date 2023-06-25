package Aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double s, h, min, sf;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tempo em segundos: ");
        s = sc.nextDouble();
        h = s/3600;
        min = (s%3600)/60;
        sf = s%60;
        System.out.printf("O Tempo é %.0f : %.0f : %.0f ", h,min,sf);
        sc.close();
    }
}
