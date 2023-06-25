package Miniteste;

public class Person {
    private String name;
    private int cc;
    private DateYMD date;

    public Person(String name, int cc, DateYMD date) {
        this.name = name;
        this.cc = cc;
        this.date = date;
    }

    public String getName(){
        return name;
    }
    public int getCc(){
        return cc;
    }
    public DateYMD getDate(){
        return date;
    }
}
