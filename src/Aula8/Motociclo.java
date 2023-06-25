package Aula8;

public class Motociclo extends Veiculo {
    private String type;

    public Motociclo(String matricula, String marca, String modelo, int potencia, String type) {
        super(matricula, marca, modelo, potencia);
        if(type.equals("desportivo") || type.equals("estrada")) {
            this.type = type;
        }
        else {
            System.out.println("Tipo assumiu valor default de 'estrada', use setType() para alterar.");
            this.type = "estrada";
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("desportivo") || type.equals("estrada")) {
            this.type = type;
        }
        else {
            System.out.println("Tipo assumiu valor default de 'estrada', use setType() para alterar.");
            this.type = "estrada";
        }
    }

    @Override
    public String toString() {
        return "Motociclo{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potencia=" + getPotencia() + ", type=" + type + '}';
    }
}
