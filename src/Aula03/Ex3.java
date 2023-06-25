package Aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        n = sc.nextInt();
        x = 0;
        if (n>0){
            for (int j = 2; j < n; j++) {
                if (n % j == 0)
                    x += 1;
            }
            if (x != 0){
                System.out.print("Não é primo ");
            }
            else {
                System.out.print("É primo ");
            }
        }
        else{
            System.out.print("Numero Inválido");
        }
        sc.close();
    }
}
