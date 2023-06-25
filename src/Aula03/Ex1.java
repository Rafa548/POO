package Aula03;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double nt, np, nf;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira nota Prática: ");
        nt = sc.nextDouble();
        System.out.print("Insira nota Teorica: ");
        np = sc.nextDouble();
        /*do {
            if (nt < 7.0 || np < 7.0){
            System.out.println("66");
        }
            else {
                nf = (0.4*nt)+(0.6*np);
                System.out.printf("%.2f",nf);
            }
        }while (20 >= nt && nt >= 0 || 20 >= np && np >= 0);*/
        if ((20 >= nt && nt >= 0) || (20 >= np && np >= 0)){
            if (nt < 7.0 || np < 7.0){
                System.out.println("66");
            }
                else {
                    nf = (0.4*nt)+(0.6*np);
                    System.out.printf("Nota final: %.2f",nf);
                }
        }
        else{
            System.out.print("Nota inválida");
        }
        sc.close();
    }
}
