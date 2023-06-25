package Aula6;

public class Pessoa {

    private String name;
    private int citizenCardNumber;
    private Date dateOfBirth;

    public Pessoa(String name, int citizenCardNumber, Date dateOfBirth) {
        this.name = name;
        this.citizenCardNumber = citizenCardNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Pessoa() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCitizenCardNumber() {
        return this.citizenCardNumber;
    }

    public void setCitizenCardNumber(int citizenCardNumber) {
        this.citizenCardNumber = citizenCardNumber;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return this.name + "; CC: " + this.citizenCardNumber + ", Data de Nascimento" + this.dateOfBirth;
    }

}



