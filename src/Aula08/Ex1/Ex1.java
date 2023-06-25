package Aula08.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Empresa mc = new Empresa("Random Corporate", "3780-426", "general@Randomco.com");
        Taxi t = new Taxi("11-AA-00", "Renault", "Clio", 2, 3, 4, 1000);
        Ligeiro c = new Ligeiro("22-BO-44", "Opel", "Corsa", 3, 4, 200);
        Pesado_M v = new Pesado_M("88-DD-99", "Ford", "Focus", 5, 1, 3000, 10000);
        Pesado_P b = new Pesado_P("66-FF-66", "Mini", "Clubman", 4, 2, 6000, 66);
        Pesado_P_E bb = new Pesado_P_E("66-FF-66", "Mini", "Clubman", 4, 2, 6000, 66,333);
        Ligeiro_E cc = new Ligeiro_E("22-BO-44", "Opel", "Corsa", 3, 4, 200, 222);
        t.trajeto(22);
        c.trajeto(26);
        v.trajeto(33);
        t.trajeto(15);
        bb.carregar(80);
        cc.carregar(20);
        System.out.println("Autonomia -> " + bb.autonomia());
        System.out.println("Autonomia -> " + cc.autonomia());
        mc.addVehicle(t);
        mc.addVehicle(c);
        mc.addVehicle(v);
        mc.addVehicle(b);
        

        if (c.distanciaTotal() > t.distanciaTotal() && c.distanciaTotal() > v.distanciaTotal() && c.distanciaTotal() > b.distanciaTotal()){
            System.out.println("Ligeiro fez a maior distancia");
        }
        if (t.distanciaTotal() > c.distanciaTotal() && t.distanciaTotal() > v.distanciaTotal() && t.distanciaTotal() > b.distanciaTotal()){
            System.out.println("Taxi fez a maior distancia");
        }
        if (v.distanciaTotal() > t.distanciaTotal() && v.distanciaTotal() > c.distanciaTotal() && v.distanciaTotal() > b.distanciaTotal()){
            System.out.println("Pesado de m fez a maior distancia");
        }
        if (b.distanciaTotal() > t.distanciaTotal() && b.distanciaTotal() > v.distanciaTotal() && b.distanciaTotal() > c.distanciaTotal()){
            System.out.println("Pesado de pass fez a maior distancia");
        }

    }

    
    
}
