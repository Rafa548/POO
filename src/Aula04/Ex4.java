package Aula04;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        String f1;
        int dia,mes,ano,f2;
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira uma data(mes/ano) -> ");
        f1=ler.nextLine();
        String[] args1 = f1.split("/");
        mes = Integer.valueOf(args1[0]);
        ano = Integer.valueOf(args1[1]);
        if(mes>12 || mes<1){
            System.out.print("Mes invalido ");
        }
        if (ano<0){
            System.out.print("Ano invalido ");
        }
        boolean x1=anoBissexto(ano);
        int ndias=mes(mes,x1);
        String nomeM=nome(mes); 
        System.out.print("Insira o dia da semana do começo do mes(Segunda=1,etc..) ->");
        f2=ler.nextInt();
        dia = f2;
        if (dia > 7 || dia < 1){
            System.out.print("Dia invalido ");
        }
        System.out.println("    " + nomeM + " de " + ano);
        System.out.println(" D   S   T   Q   Q   S   S");
        int dia1 = (dia+1);
        if (dia != 1){
            for (int h = 1; h <= dia;h++){
                System.out.print("    ");
            }
        }
        for (int i = 1; i <= ndias;i++){
            if(dia1%8 == 0){
                System.out.println("\n");
                dia1++;
            }
            if (i < 10){
                System.out.print(" "+ i + "  ");
                dia1++;
            }
            else{
                System.out.print(i + "  ");
                dia1++;
            }
            
        }
        ler.close();
    }
    public static boolean anoBissexto(int ano){
        if ((ano%4==0 && ano%100!=0) || ano%400==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int mes(int nMes,boolean bissexto){
        int x1=28;
        int x2=29;
        int x3=30;
        int x4=31;
        switch(nMes){
            case 4:
            case 6:
            case 9:
            case 11:
                return x3;
            case 2:
                if (bissexto==true) {
                    return x2;
                }else {
                    return x1;
                }
            default:
                return x4;
        }
    } 
    public static String nome(int mes){
        String x1="Janeiro";
        String x2="Fevereiro";
        String x3="MarÃ§o";
        String x4="Abril";
        String x5="Maio";
        String x6="Junho";
        String x7="Julho";
        String x8="Agosto";
        String x9="Setembro";
        String x10="Outubro";
        String x11="Novembro";
        String x12="Dezembro";
        switch(mes) {
            case 1:
                return x1;
            case 2:
                return x2;
            case 3:
                return x3;
            case 4:
                return x4;
            case 5:
                return x5;
            case 6:
                return x6;
            case 7:
                return x7; 
            case 8:
                return x8;
            case 9:
                return x9;
            case 10:
                return x10;
            case 11:
                return x11;
            default:
                return x12;
            
        }
    }
}

