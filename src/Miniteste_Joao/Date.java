package Miniteste_Joao;

public abstract class Date implements Comparable<Date> {
    protected int year;
    protected int month;
    protected int day;
    public abstract int getYear();
    public abstract int getMonth();
    public abstract int getDay();
    public abstract void setDate(int year, int month, int day);
    public abstract boolean valid(int year, int month, int day);
    public abstract boolean validMonth(int month);
    public abstract int monthDays(int month, int year);
    public abstract String toString();
    @Override
    public int compareTo(Date o) {
        if (this.getYear() > o.getYear())
            return 1;
        else if (this.getYear() == o.getYear())
            if (this.getMonth() > o.getMonth())
                return 1;
            else if (this.getMonth() == o.getMonth())
                if (this.getDay() > o.getDay())
                    return 1;
                else if (this.getDay() == o.getDay())
                    return 0;
                
        return -1;
    }
}
