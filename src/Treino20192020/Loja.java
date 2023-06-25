package Treino20192020;

import java.util.TreeSet;

public class Loja {
    private String nome;
    private String endwebsite;
    private TreeSet<Produto> produtos = new TreeSet<Produto>(Produto::compare); //defenida no produto como é para ordenar

    public Loja(String nome, String endwebsite) {
        this.nome = nome;
        this.endwebsite = endwebsite;
    }
    

    public int totalItems() {
        int c= 0;
        for (Produto produto : produtos){
            c += produto.getQuantidade();
        }
        return c;
    }

    public void add(Produto p){
        produtos.add(p);
    }


    public String getEndwebsite() {
        return endwebsite;
    }


    public void setEndwebsite(String endwebsite) {
        this.endwebsite = endwebsite;
    }


    @Override
    public String toString() {
        String s = "";
        s+= "Loja " + nome + "\n";
        s+= "\n";
        s+= String.format("%-8s%-30s%-15s%s\n", "Código", "Produto", "Em Stock", "PVP");
        for (Produto produto : produtos){
            s+= String.format("%-8s%-30s%-15s%s\n", produto.getCodigo(),produto.getDescricao(),produto.getQuantidade(),produto.precoVendaAoPublico());
        }
        return s;
    }


    public String getProdutoPelaDescricao(String r) {
        for (Produto produto : produtos){
            if (produto instanceof Electrodomestico){
                if (produto.getDescricao().equals(r)){
                    return produto.toString();
                }
            }
            else if (produto instanceof Telemovel){
                if (produto.getDescricao().equals(r)){
                    return produto.toString();
                }
            }
        }
        return "";
    }

    

}
