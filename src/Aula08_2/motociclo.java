package Aula08_2;

public class motociclo extends Veiculo{

    private String tipo;

    public motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;    
    }
    
    public String getTipo() {
        return tipo;
    }

    public void SetTipo(String tipo){
        this.tipo = tipo;
    }
    public String toString(){
        return ("matricula");
    }
}
