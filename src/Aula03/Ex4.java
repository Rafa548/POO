package Aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int ni, tn, media, tries;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        ni = sc.nextInt();
        int soma = ni, max = ni ,min = ni;
        tries = 0;
        do{
            System.out.print("Insira o numero: ");
            tn = sc.nextInt();
            soma += tn;
            tries += 1;
            if (tn>max){
                max = tn;
            }
            else if (tn<min){
                min = tn;
            }
        }while(tn != ni);
        media = soma/tries;
        System.out.printf("Media: %1d \n",media);
        System.out.printf("Max: %1d \n",max);
        System.out.printf("Min: %1d  \n",min);
        sc.close();
    }
}
