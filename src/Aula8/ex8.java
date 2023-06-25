package Aula8;

public class ex8 {
    
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa", "12345-678", "test@gmail.com");
        empresa.addVeiculo(new AutoLigeiro("12345", "Marca", "Modelo", 2019, 4, 4));
        empresa.addVeiculo(new Motociclo("54321", "Marca", "Modelo", 313, "estrada"));
        empresa.addVeiculo(new Taxi("12345", "Marca", "Modelo", 2019, 4, 4, 123));
        empresa.addVeiculo(new PesadoMerc("12345", "Marca", "Modelo", 2019, 4, 4, 123));
        empresa.addVeiculo(new PesadoPass("12345", "Marca", "Modelo", 2019, 4, 4, 123));
        empresa.addVeiculo(new Motociclo("54321", "Marca", "Modelo", 313, "desportivo"));
        empresa.addVeiculo(new Motociclo("54321", "Marca", "Modelo", 313, "test"));
        System.out.println(empresa.getVeiculos()[0].ultimaTrajeto());
        empresa.getVeiculos()[0].trajeto(20);
        System.out.println(empresa.getVeiculos()[0].ultimaTrajeto());
        empresa.getVeiculos()[0].trajeto(30);
        System.out.println(empresa.getVeiculos()[0].distanciaTotal());
    }
}
