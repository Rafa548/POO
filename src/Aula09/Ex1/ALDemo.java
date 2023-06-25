package Aula09.Ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import Aula06.Ex1.Pessoa;
import Aula06.Ex1.Date;

    public class ALDemo {
        public static void main(String[] args) {
            ArrayList<Integer> c1 = new ArrayList<>();
            for (int i = 10; i <= 100; i+=10)
            c1.add(i);
            System.out.println("Size: " + c1.size());
            for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
            ArrayList<String> c2 = new ArrayList<>();
            c2.add("Vento");
            c2.add("Calor");
            c2.add("Frio");
            c2.add("Chuva");
            c2.add("Frio");
            c2.add("Frio");
            c2.add("Chuva");
            System.out.println(c2);
            Collections.sort(c2);
            System.out.println(c2);
            c2.remove("Frio");
            c2.remove(0);
            System.out.println(c2);
            int v_1 = c2.indexOf("Vento");
            int c_l = c2.lastIndexOf("Frio");

            System.out.println("vento 1ªvez -> " + v_1);
            System.out.println("Frio ultima vez -> " + c_l);

            Set<Pessoa> c3 = new HashSet<>();
            c3.add(new Pessoa("s",22, new Date (5,5,2003)));
            c3.add(new Pessoa("d",23, new Date (6,5,2003)));
            c3.add(new Pessoa("f",24, new Date (7,5,2003)));
            c3.add(new Pessoa("g",25, new Date (8,5,2003)));
            c3.add(new Pessoa("h",26, new Date (9,5,2003)));
            System.out.println(c3);  //ordem aleatória
            c3.add(new Pessoa("f",24, new Date (7,5,2003)));; //2 vez
            System.out.println(c3);

            Set<Date> c4 = new TreeSet<>();
            c4.add(new Date(1,2,1995));
		    c4.add(new Date(7,11,2000));
		    c4.add(new Date(3,5,1763));
		    c4.add(new Date(1,5,2000));
		    c4.add(new Date(1,4,1995));
            System.out.println(c4); //ordem natural
        }
}
