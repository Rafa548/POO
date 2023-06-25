package Treino20192020;

public class Electrodomestico extends Produto{
    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica c;
    private double potencia;

    public Electrodomestico(String tipo, String marca, String modelo, int potencia,int preco) {
        super("E");
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = Double.valueOf(potencia);
        this.preco = Double.valueOf(preco);
    }

    public Electrodomestico(String tipo, String marca, String modelo, int preco) {
        super("E");
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = Double.valueOf(preco);
    }

    public void setClasse(ClasseEnergetica a) {
        this.c = a;
    }
    
    @Override
    public String getDescricao() {
        return tipo+":"+marca+"/"+modelo;
    }

    public String toString() {
        return "["+codigo+" "+tipo+" "+marca+ " " + modelo + " " + c + " "+ potencia + " W]";
    }

}
