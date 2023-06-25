package Aula3;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.print("Numero positivo? ");
        N = sc.nextInt();
        }while(N <= 0);

        sc.close();

        while(N >= 0){
            System.out.println(N);
            N -= 1;
        }
    }
}
