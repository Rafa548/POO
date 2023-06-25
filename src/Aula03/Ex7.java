package Aula03;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n, t;
        String resposta;
        Scanner sc = new Scanner(System.in);
        do{
            int Random = (int)(Math.random()*100);
            t = 0;
            do{
                System.out.print("Insira o numero: ");
                n = sc.nextInt();
                if (n>Random){
                System.out.println("Alto");
                }
                else if (n<Random){
                    System.out.println("Baixo");
                }
                t += 1;
            } while( n != Random);
            System.out.println("Acertaste :)");
            System.out.printf("Tentativas--> %1d \n",t);
            System.out.print("Continuar? Prima (S)im: ");
            resposta = sc.next();
        }
        while (resposta.equals("s")  || resposta.equals("S"));
        sc.close();
    }
}
