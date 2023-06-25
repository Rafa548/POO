package Aula5;

public class Calendar {
    private int firstWeekdayOfYear, year;

    public Calendar() {
    }

    public Calendar(int firstWeekdayOfYear, int year) {
        if (firstWeekdayOfYear < 1 || firstWeekdayOfYear > 7) {
            throw new IllegalArgumentException("Invalida date");
        }
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        this.year = year;
    }

    public int getFirstWeekdayOfYear() {
        return this.firstWeekdayOfYear;
    }

    public int getYear() {
        return this.year;
    }

    public int firstWeekdayOfMonth(int month) {
        int days = getFirstWeekdayOfYear();
        for (int i = 1; i < month; i++) {
            days += Date.monthDays(i, year);
        }
        days = days % 7;
        return days;
    }

    public void printMonth(int month) {
        int firstdayofmonth = firstWeekdayOfMonth(month);
        int tracker = firstdayofmonth;
        System.out.printf("%s\n", centerString(month, year, 20));
        System.out.println(" Su Mo Tu We Th Fr Sa");
        System.out.print("   ".repeat(firstdayofmonth));
        for (int i = 1; i <= Date.monthDays(month, year)-1; i++) {
            if (tracker == 6) {
                System.out.printf("%3s\n", i);
                tracker = 0;
            } else {
                System.out.printf("%3s", i);
                tracker += 1;
            }
        }
        System.out.printf("%3s\n", Date.monthDays(month, year));
    }

    @Override
    public String toString() {
        String iguess = "";
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%s\n", centerString(i, year, 20));
            System.out.println(" Su Mo Tu We Th Fr Sa");
            int firstdayofmonth = firstWeekdayOfMonth(i);
            int tracker = firstdayofmonth;
            System.out.print("   ".repeat(firstdayofmonth));
            for (int j = 1; j <= Date.monthDays(i, year)-1; j++) {
                if (tracker == 6) {
                    System.out.printf("%3s\n", j);
                    tracker = 0;
                } else {
                    System.out.printf("%3s", j);
                    tracker += 1;
                }
            }
            System.out.printf("%3s\n", Date.monthDays(i, year));
        }
        return iguess;
    }

    public String centerString(int month, int year, int spacereserve) {
        String[] monthName = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        String centeredString = "", words = monthName[month - 1] + " " + String.valueOf(year);
        int spacesbyside, sizeofwords = words.length();
        spacesbyside = (spacereserve - sizeofwords) / 2;
        for (int i = 0; i <= spacesbyside; i++) {
            centeredString += " ";
        }
        centeredString += words;
        return centeredString;
    }
}
