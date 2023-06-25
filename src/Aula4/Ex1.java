package Aula4;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Usrinput;
        int Stringlength;
        System.out.println("Escreva uma frase:");
        Usrinput = sc.nextLine();
        sc.close();
        Stringlength = Usrinput.length();
        System.out.printf("Minusculas: %s\n",Usrinput.toLowerCase());
        System.out.printf("Ultima letra: %s\n",Usrinput.charAt(Stringlength-1));
        System.out.printf("Primeiras 3 letras: %s\n",Usrinput.substring(0,3));
        System.out.printf("Maiusculas: %s\n",Usrinput.toUpperCase());
        System.out.printf("Adicionar test ao final da string: %s\n",Usrinput.concat("test"));
        System.out.printf("String começa com S: %s\n",Usrinput.startsWith("S"));
    } 
}
