package Miniteste;

public class DateYMD {
    private int day;
    private int month;
    private int year;
    private String date;


    public DateYMD(String date){
        this.date = date;
    }

    public DateYMD(int day, int month, int year){
        if (Vdata(day,year,month) == false){
            System.out.println("Data Invalida");
            System.exit(0);
        }
        else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
    
    public String getDate(){
        return date;
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

    public static boolean Vdata(int dia, int ano, int mes ){
        boolean c = anoBissexto(ano);
        int ndias = monthDays(mes,c);
        if(ndias>=dia & ano>0 & (mes<=12 && mes>=1)){
            return true;
        }
        else {
            return false;
        }
    }
}
