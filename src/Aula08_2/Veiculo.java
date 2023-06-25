package Aula08_2;

public class Veiculo implements KmPercorridosInterface{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int u_traj;
    private int d_total;

    public Veiculo(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setMatricula( String matricula){
        this.matricula = matricula;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void trajeto(int km){
        u_traj = km;
        d_total += 0;
    }

    public int ultimoTrajeto(){
        return u_traj;
    }

    public int distanciaTotal(){
        return d_total;
    }

}
