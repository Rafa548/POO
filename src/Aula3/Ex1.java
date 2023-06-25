package Aula3;
import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        double notaT, notaP, notaF;
        Scanner sc = new Scanner(System.in);
        
        // Inputs, tem que ser entre [0,20]
        do{
            System.out.println("Nota da componente Teórica? (Entre 0 a 20)");
            notaT = sc.nextDouble();
        }while(notaT < 0 || notaT > 20);
        do{
            System.out.println("Nota da componente Prática? (Entre 0 a 20)");
            notaP = sc.nextDouble();
        }while(notaP < 0 || notaP > 20);

        sc.close();
        
        //Reprova se notaT ou notaP <= 7.0
        if (notaT <=7.0 || notaP <= 7.0) {
            System.out.println("66");
        } else {
            notaF = 0.4*notaT + 0.6*notaP;
            System.out.format("%.0f \n", notaF);
        }
    }
}