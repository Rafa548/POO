package Aula05.Ex1;

public class Date{

    private int ano,mes,dia;

    public Date(int dia,int mes,int ano){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno(){
        return ano;
    }

    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }

    public static int monthDays(int nMes,boolean bissexto){
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
                }
                else {
                    return x1;
                }
            default:
                return x4;
        }
    }

    public static boolean anoBissexto(int ano){
        if ((ano%4==0 && ano%100!=0) || ano%400==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean Vmes(int mes){
        if(mes>12 || mes<1){
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean Vdata(int dia, int ndias ){
        if(ndias>=dia){
            return true;
        }
        else {
            return false;
        }
    }
}

