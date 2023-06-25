package Miniteste_Joao;

public class DateYMD extends Date {
    public DateYMD(int d, int m, int y) {
        if (valid(y, m, d)) {
            year = y;
            month = m;
            day = d;
        } else {
            System.out.println("Error: Invalid date. (DD-MM-YYYY)");
        }
    }
    public DateYMD() {
        year = 0;
        month = 0;
        day = 0;
    }
    // Metodos
    public boolean validMonth(int m) {
        return (m >= 1 && m <= 12) ? true : false;
    }
    public int monthDays(int month, int year) {
        boolean bissexto = false;
        if (!(year % 100 == 0 && year % 400 != 0)) {
            if (year % 4 == 0)
                bissexto = true;
        }
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                return 31;
            case (2):
                if (bissexto == true) {
                    return 29;
                } else {
                    return 28;
                }
            case (4):
            case (6):
            case (9):
            case (11):
                return 30;
        }
        return 0;
    }
    public static boolean leapYear(int year) {
        boolean leap = false;
        if (!(year % 100 == 0 && year % 400 != 0)) {
            if (year % 4 == 0)
                leap = true;
        }
        return leap;
    }
    public boolean valid(int y, int m, int d) {
        return ((y >= 0) && (validMonth(m)) && ((d >= 1) && (d <= monthDays(m, y)))) ? true : false;
    }
    public void setDate(int year, int month, int day) {
        if (this.valid(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Error: Invalid Date.");
        }
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void increment() {
        if (day == monthDays(month, year)) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
            } else {
                month++;
                day = 1;
            }
        } else {
            day++;
        }
    }
    public void decrement() {
        if (day == 1) {
            if (month == 1) {
                year--;
                month = 12;
                day = monthDays(month, year);
            } else {
                month--;
                day = monthDays(month, year);
            }
        } else {
            day--;
        }
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    @Override
    public boolean equals(Object o) {
        Date d2 = (Date) o;
        return (this.getDay() == d2.getDay()) && (this.getMonth() == d2.getMonth()) && (this.getYear() == d2.getYear());
    }
   
}
