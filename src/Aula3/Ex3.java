package Aula3;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        boolean prime = true;
        int N;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Numero positivo? ");
            N = sc.nextInt();
        }while(N<=0);
        

        sc.close();

        for(int x = 2; x<N; x++) {
            if(N%x == 0){
                prime = false;
                break;
            }
        }

        if(prime && N != 1){
            System.out.format("%s é primo \n", N);
        } else {
            System.out.format("%s nao é primo \n", N);

        }
    }
}
