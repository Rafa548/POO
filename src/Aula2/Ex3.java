package Aula2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        double M, iniT, endT, Q;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much Water? ");
        M = sc.nextFloat();
        System.out.print("Initial Temperature? ");
        iniT = sc.nextFloat();
        System.out.print("Final Temperature? ");
        endT = sc.nextFloat();
        sc.close();
        Q = M * (endT - iniT) * 4184;
        System.out.println("The energy required for heating is " + Q + " Joules.");
    }    
}
