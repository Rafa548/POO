package Aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double ninv, taxm, vt, vg;
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor investido: ");
        ninv = sc.nextDouble();
        mes = 0;
        if ((ninv % 1000 == 0) && (ninv > 0) ){
            System.out.print("Insira a taxa desejada: ");
            taxm = sc.nextDouble();
            if ((taxm > 0) && (taxm < 5) ){
                while (mes<12){
                    vg = (ninv*taxm/100);
                    vt = (ninv+vg);
                    ninv += vg;
                    mes += 1;
                    System.out.printf("Mês %1d - %.0f \n",mes,vt);
                }
            }
            else{
                System.out.print("Taxa deve ser entre 0-5 %");
            }
        }
        else{
            System.out.print("Valor investido precisa ser positivo multiplo de 1000");
        }
        sc.close();
    }
}
