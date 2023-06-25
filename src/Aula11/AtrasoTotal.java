package Aula11;


public class AtrasoTotal implements Comparable<AtrasoTotal> {
    private String companhia;
    private int atrasoTotal;
    private int numeroDeAtrasos;

    public AtrasoTotal(String companhia, String atrasoTotal) {
        this.companhia = companhia;
        this.atrasoTotal = StringtoInt(atrasoTotal);
        this.numeroDeAtrasos = 1;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getAtrasoTotal() {
        return atrasoTotal;
    }

    public void setAtrasoTotal(int atrasoTotal) {
        this.atrasoTotal = atrasoTotal;
    }

    public int getNumeroDeAtrasos() {
        return numeroDeAtrasos;
    }

    public void setNumeroDeAtrasos(int numeroDeAtrasos) {
        this.numeroDeAtrasos = numeroDeAtrasos;
    }

    public void incrementAtraso(String atraso){
        this.atrasoTotal += StringtoInt(atraso);
        this.numeroDeAtrasos += 1;
    }

    private static int StringtoInt(String Atraso) {
        if (Atraso.equals("")) {
            return 0;
        } else {
            String[] Atrasos = Atraso.split(":");
            int hora = Integer.parseInt(Atrasos[0]);
            int min = Integer.parseInt(Atrasos[1]);
            return (hora * 60) + min;
        }
    }

    @Override
    public String toString() {
        double median = atrasoTotal / numeroDeAtrasos;
        int hours = (int) median/60;
        int mins = (int) median%60;
        String result = String.format("%02d:%02d", hours, mins);
        return String.format("%-21s %-8s", companhia, result);
    }

    public int compareTo(AtrasoTotal o) {
        AtrasoTotal d = (AtrasoTotal) o;
        double atraso1 = this.atrasoTotal / this.numeroDeAtrasos;
        double atraso2 = d.atrasoTotal / d.numeroDeAtrasos;
        if(atraso1 > atraso2){
            return 1;
        } else if (atraso1 < atraso2){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        AtrasoTotal d = (AtrasoTotal) o;
        if(this.companhia.equals(d.companhia)){
            return true;
        } else {
            return false;
        }
    }
}
