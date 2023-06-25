package Aula8;

public class Empresa {
    private String name;
    private String postalCode;
    private String email;
    private Veiculo[] veiculos = new Veiculo[10];

    public Empresa(String name, String postalCode, String email) {
        this.name = name;
        this.postalCode = postalCode;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = veiculo;
                break;
            }
        }
    }
}
