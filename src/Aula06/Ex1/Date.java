package Aula06.Ex1;

import java.time.OffsetDateTime;

public class Date implements Comparable<Date> {
    private int ano,mes,dia;

    public Date() {
		
	}
    public Date(int dia,int mes,int ano){
        if (Vdata(dia,ano,mes) == false){
            System.out.println("Data Invalida");
            System.exit(0);
        }
        else{
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
        }
        
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

    public static Date today() {
		OffsetDateTime dt = OffsetDateTime.now();
		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int a = dt.getYear();
		
		return new Date(d, m, a);
	}

    @Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Date other = (Date) o;
        if (this.dia != other.dia)
            return false;
        if (this.mes != (other.mes))
            return false;
        if (this.ano != other.ano)
            return false;
        return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dia;
		result = prime * result + mes;
        result = prime * result + ano;
		return result;
	}

    @Override
	public int compareTo(Date d) {
		if(this.ano - d.ano !=0) {
			return this.ano-d.ano;
		} else if(this.mes - d.mes !=0) {
			return this.mes-d.mes;
		} else if(this.dia - d.dia !=0) {
			return this.dia-d.dia;
		}
		return 0;	
	}

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
