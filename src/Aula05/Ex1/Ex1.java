package Aula05.Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String op;
        Scanner sc = new Scanner(System.in);
        do  {
            menu();
            op = sc.nextLine();
            switch(op){
            
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
					System.out.println("Insira uma opção válida!");
                }
                System.out.println();
            }
        while (!op.equals("0"));
        
        sc.close();
    }

    public static void menu() {
		System.out.println("----------- Date operations -----------\n"
				+ "1 - create new date\n"
				+ "2 - show current date\n"
				+ "3 - increment date\n"
				+ "4 - decrement date\n"
				+ "0 - exit\n");
	}
}
