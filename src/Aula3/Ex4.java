package Aula3;
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialvalue, usrinput, minvalue, maxvalue, median = 0;
        int totalnumbers = 0;
        System.out.println("Introduza um número inteiro.");
        minvalue = maxvalue = initialvalue = sc.nextDouble();
        do {
            System.out.printf("Introduza um número inteiro, ou %d para terminar o input.\n", initialvalue);
            usrinput = sc.nextDouble();
            if(usrinput > maxvalue) {
                maxvalue = usrinput;
            } else if(usrinput < minvalue) {
                minvalue = usrinput;
            }
            median += usrinput;
            totalnumbers += 1;
        } while (usrinput != initialvalue);
        sc.close();
        median = median/totalnumbers;

        System.out.printf("Valor máximo: %s, valor mínimo %s, média %s, total de números lidos %d \n", maxvalue, minvalue, median, totalnumbers);
    }
}
