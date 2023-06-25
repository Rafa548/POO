package Aula03;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        short mes, ano, dias;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o mes: ");
        mes = sc.nextShort();
        if (mes>12 || mes<1){
            System.out.print("Mês inválido");
        }
        else {
            System.out.print("Insira o ano: ");
            ano = sc.nextShort();
            if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
                if (mes == 1 || ((mes % 2) == 1)){
                    dias = 31;
                    System.out.printf("Numero de dias: %1d",dias);
                }
                else if (mes == 2){
                    dias = 29;
                    System.out.printf("Numero de dias: %1d",dias);
                }
                else {
                    dias = 30;
                    System.out.printf("Numero de dias: %1d",dias);
                }
            }
            else {
                if (mes == 1 || ((mes % 2) == 1)){
                    dias = 31;
                    System.out.printf("Numero de dias: %1d",dias);
                }
                if (mes == 2){
                    dias = 28;
                    System.out.printf("Numero de dias: %1d",dias);
                }
                else {
                    dias = 30;
                    System.out.printf("Numero de dias: %1d",dias);
                }
            }
        }
        sc.close();
    }
}
