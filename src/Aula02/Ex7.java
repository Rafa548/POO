package Aula02;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double p1x,p1y,p2y, p2x, dist;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a coordenada x do p1: ");
        p1x = sc.nextDouble();
        System.out.print("Insira a coordenada y do p1: ");
        p1y = sc.nextDouble();
        System.out.print("Insira a coordenada x do p2: ");
        p2x = sc.nextDouble();
        System.out.print("Insira a coordenada y do p2: ");
        p2y = sc.nextDouble();
        dist = (Math.sqrt(Math.pow(p1x-p2x,2) + Math.pow(p1y-p2y,2)));
        System.out.println("A distância é " + dist);
        sc.close();
    }
}
