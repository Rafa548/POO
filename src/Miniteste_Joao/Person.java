package Miniteste_Joao;



public class Person {
    private String nome;
    private int cc;
    private DateYMD dataNasc;
    public Person (String nome, int cc, DateYMD dataNasc) {
        if ((nome.length() > 0) && (cc > 0) ){ // a validação da data já é feita no construtor Date()
            this.nome = nome;
            this.cc = cc;
            this.dataNasc = dataNasc; 
        } else {
            System.out.println("ERROR: Informação inválida");
        }
    }
    public Person() {
        nome = "";
        cc = 0;
        dataNasc = new DateYMD(0, (byte) 0, (byte) 0);
    }
    public String getName() {
        return nome;
    }
    public int getCC() {
        return cc;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setName(String n) {
        nome = n;
    }
    public void setCC(int c) {
        cc = c;
    }
    public void setDataNasc(DateYMD d) {
        dataNasc = d;
    }
    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc.toString();
    }
}
