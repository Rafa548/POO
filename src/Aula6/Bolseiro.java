package Aula6;

public class Bolseiro extends Aluno {
    private double monthlyBolseiroMoney;

    public Bolseiro(String name, int citizenCardNumber, Date dateOfBirth, double monthlyBolseiroMoney, Date dateOfEnrollment) {
        super(name, citizenCardNumber, dateOfBirth, dateOfEnrollment);
        this.monthlyBolseiroMoney = 0;
    }

    public Bolseiro(String name, int citizenCardNumber, Date dateOfBirth, double monthlyBolseiroMoney) {
        super(name, citizenCardNumber, dateOfBirth);
        this.monthlyBolseiroMoney = monthlyBolseiroMoney;
    }

    public Bolseiro() {
    }

    public double getBolsa() {
        return this.monthlyBolseiroMoney;
    }

    public void setBolsa(double monthlyBolseiroMoney) {
        this.monthlyBolseiroMoney = monthlyBolseiroMoney;
    }

    public String getName() {
        return super.getName();
    }

    public int getCitizenCardNumber() {
        return super.getCitizenCardNumber();
    }

    public Date getDateOfBirth() {
        return super.getDateOfBirth();
    }

    public Date getDateOfEnrollment() {
        return super.getDateOfEnrollment();
    }

    public int getNMec() {
        return super.getNMec();
    }
    @Override
    public String toString() {
        return getName() + "; CC: " + getCitizenCardNumber() + "; Data de nascimento: " + getDateOfBirth()
                + "; Número mecanográfico: " + getNMec() + "; Data de Inscrição: "
                + getDateOfEnrollment() + "; Quantidade de Bolsa: " + this.monthlyBolseiroMoney;
    }
}
