package Aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        n = sc.nextInt();
        if (n>0){
            do{
                n -= 1;
                System.out.println(n);
            }while( n > 0);
        }
        else{
            System.out.print("Numero Inválido");
        }

        sc.close();
    }
}
