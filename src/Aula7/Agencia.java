package Aula7;

public class Agencia {
    private String nome;
    private String endereço;
    private Alojamento[] alojamentos = new Alojamento[10];
    private Viatura[] viaturas = new Viatura[10];
    
    public Agencia(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void addAlojamento(String codigo, String nome, String local, double price, double rating, int rooms) {
        for (int i = 0; i < alojamentos.length; i++) {
            if (alojamentos[i] == null) {
                alojamentos[i] = new Apartamento(codigo, nome, local, price, rating, rooms);
                break; 
            }
        }
    }

    public void addAlojamento(String codigo, String nome, String local, double price, double rating, String type) {
        for (int i = 0; i < alojamentos.length; i++) {
            if (alojamentos[i] == null) {
                alojamentos[i] = new Quarto(codigo, nome, local, price, rating, type);
                break;
            }
        }
    }

    public void addViatura(char classe, String type) {
        for (int i = 0; i < viaturas.length; i++) {
            if (viaturas[i] == null) {
                viaturas[i] = new Carro(classe, type);
                break;
            }
        }
    }



    public void removeAlojamento(int index) {
        alojamentos[index] = null;
        for (int i = index; i < alojamentos.length - 1; i++) {
            alojamentos[i] = alojamentos[i + 1];
        }
    }

    public void removeViatura(int index) {
        viaturas[index] = null;
        for (int i = index; i < viaturas.length - 1; i++) {
            viaturas[i] = viaturas[i + 1];
        }
    }

    public String listAlojamentos() {
        String list = "";
        for (int i = 0; i < alojamentos.length; i++) {
            if (alojamentos[i] != null) {
                list += i + " -> " + alojamentos[i].toString() + "\n";
            }
        }
        return list;
    }

    public String listViaturas() {
        String list = "";
        for (int i = 0; i < viaturas.length; i++) {
            if (viaturas[i] != null) {
                list += i + " -> " + viaturas[i].toString() + "\n";
            }
        }
        return list;
    }

    public boolean checkin(int index) {
        return alojamentos[index].checkin();
    }

    public boolean checkout(int index) {
        return alojamentos[index].checkout();
    }

    public boolean vehicleCheckin(int index) {
        return viaturas[index].levantar();
    }

    public boolean vehicleCheckout(int index) {
        return viaturas[index].entregar();
    }
}