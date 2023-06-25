package Aula6;
import java.util.Calendar;

public class Date {
    private int day, month, year;

    public Date() {
        long currentTime = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH)+1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public Date(int day, int month, int year) {
        if (!valid(day, month, year)) {
            throw new IllegalArgumentException("Invalida date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean validMonth(int month) {
        return (1 <= month && month <= 12);
    }

    public static int monthDays(int month, int year) {
        int days;
        if (!validMonth(month)) {
            throw new IllegalArgumentException("Invalida date");
        }
        switch (month) {
            case 2:
                if (leapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            default:
                days = 31;
                break;
        }
        return days;
    }

    public static boolean leapYear(int year) {
        boolean ver;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                ver = true;
            } else {
                ver = false;
            }
        } else {
            if (year % 4 == 0) {
                ver = true;
            } else {
                ver = false;
            }
        }
        return ver;
    }

    public boolean valid(int day, int month, int year) {
        boolean ver = true;
        if (1 > day || day > monthDays(month, year)) {
            ver = false;
        }
        if (year < 0) {
            ver = false;
        }
        return ver;
    }

    public void set(int day, int month, int year) {
        //assert valid(day, month, year) == true;
        if (!valid(day, month, year)) {
            throw new IllegalArgumentException("Invalida date");
        }
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void increment() {
        this.day += 1;
        if (this.day > monthDays(month, year)) {
            this.day = 1;
            this.month += 1;
            if (this.month > 12) {
                this.month = 1;
                this.year += 1;
            }
        }
    }

    public void decrement() {
        this.day -= 1;
        if (this.day < 1) {
            if (this.month - 1 < 1) {
                this.day = monthDays(12, year - 1);
                this.month = 12;
            } else {
                this.month -= 1;
                this.day = monthDays(month, year);
            }
        }
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }

}
