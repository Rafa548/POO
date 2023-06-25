package Aula6;

public class Aluno extends Pessoa {
    private int mechanicalNumber;
    private Date dateOfEnrollment;
    private static int lastNumber = 100;

    public Aluno(String name, int citizenCardNumber, Date dateOfBirth, Date dateOfEnrollment) {
        super(name, citizenCardNumber, dateOfBirth);
        this.mechanicalNumber = lastNumber;
        this.dateOfEnrollment = dateOfEnrollment;
        lastNumber += 1;
    }

    public Aluno(String name, int citizenCardNumber, Date dateOfBirth) {
        super(name, citizenCardNumber, dateOfBirth);
        this.mechanicalNumber = lastNumber;
        this.dateOfEnrollment = new Date();
        lastNumber += 1;
    }

    public Aluno() {
    }

    public int getNMec() {
        return this.mechanicalNumber;
    }

    public void setMechanicalNumber(int mechanicalNumber) {
        this.mechanicalNumber = mechanicalNumber;
    }

    public Date getDateOfEnrollment() {
        return this.dateOfEnrollment;
    }

    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
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

    @Override
    public String toString() {
        return getName() + "; CC: " + getCitizenCardNumber() + "; Data de nascimento: " + getDateOfBirth()
                + "; Número mecanográfico: " + this.mechanicalNumber + "; Data de Inscrição: "
                + this.dateOfEnrollment;

    }
}
