package Treino20192020;

public abstract class Produto implements PVP {
    protected String codigo;
    protected int quantidade = 1;
    protected double preco;
    private static int counter = 1000;

    public Produto(String Start) {
        this.codigo = Start + String.valueOf(counter);
        counter+=2;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void addStock(int x){ 
        quantidade = quantidade+x;
    }

    public void setStock(int x){ 
        quantidade = x;
    }

    public boolean vender(int i) {
        if (quantidade>=i){
            quantidade = quantidade-i;
            return true;
        }
        return false;
    }
    public int getStock() {
        return quantidade;
    }
    
    public double precoVendaAoPublico(){
        return preco+(preco*(0.23));
    }
    
    public Object getDescricao() {
        return null;
    }

    public int compare(Produto p) {
		return this.codigo.compareTo(p.codigo);
	}

}
