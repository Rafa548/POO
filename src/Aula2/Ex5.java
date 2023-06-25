package Aula2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        float v1, v2, d1, d2, median;
        Scanner sc = new Scanner(System.in);
        System.out.print("V1? ");
        v1 = sc.nextFloat();
        System.out.print("V2? ");
        v2 = sc.nextFloat();
        System.out.print("D1? ");
        d1 = sc.nextFloat();
        System.out.print("D2? ");
        d2 = sc.nextFloat();
        sc.close();
        median = (d1+d2)/((d2/v2)+(d1/v1));
        System.out.println("The median velocity is " + median + " m/s");
        
    }
}
