package Aula7;

abstract class Alojamento {
    protected String codigo;
    protected String nome;
    protected String local;
    protected double price;
    protected boolean available;
    protected double rating;
    abstract boolean checkin();
    abstract boolean checkout(); 
}
