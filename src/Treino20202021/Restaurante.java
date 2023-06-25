package Treino20202021;

public class Restaurante{
    private String nome;
    private TipoComida t_comida;

    public Restaurante(String string, TipoComida t_comida) {
        this.nome = string;
        this.t_comida = t_comida;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoComida getTipoComida() {
        return t_comida;
    }

    public void setTipoComida(TipoComida t_comida){
        this.t_comida = t_comida;
    }

    public String toString(){
        return "Restaurante " + "[" + "nome=" + this.getNome()+ ", tipo=" + this.getTipoComida() + "]";
    }
}
