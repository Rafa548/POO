package Aula3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double Tax, Invest;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Montante Investido? (Positivo e multiplo de 1000) ");
            Invest = sc.nextDouble();
        } while (Invest <= 0 || Invest%1000 != 0);
        
        do {
            System.out.println("Taxa Mensal? (Entre 0% a 5%)");
            Tax = sc.nextDouble()/100 ;
        } while (Tax < 0 || Tax > 0.05);
        sc.close();
        
        for(int i = 0; i<=12; i++) {
            System.out.format("No mês %d o valor mensal é %.2f. \n", i, Invest);
            System.out.println();
            Invest += Invest*Tax;
        }
    }
}
