package Treino20202021;

public class Organizacao {
    private String contacto;

    public Organizacao(String contacto) {
        this.contacto = contacto;
    }

    public String getContacto() {return contacto;}
    public void setContacto(String contacto) {this.contacto = contacto;}

    @Override
    public String toString() {
        return "Organização [contacto=" + this.getContacto() + "]";
    }
}
