package Aula04;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma frase: ");
        String s1 = sc.nextLine();
        System.out.println("Acrónimo -> " + AC(s1));
        
        sc.close();
    }
    public static String AC(String text) {
        String[] Palavras = text.split(" ");
        String ACC = "";
        for (int i=0; i < Palavras.length; i++){
            if (Palavras[i].length() > 3){
                ACC += Palavras[i].charAt(0);
            }
        }
        ACC = ACC.toUpperCase();
        return ACC;
    }
    
}
