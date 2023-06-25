package Aula04;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma frase: ");
        String s1 = sc.nextLine();
        System.out.println("Digitos -> " + CountDigits(s1));
        System.out.println("Espaços -> " + CountSpaces(s1));
        System.out.println(CountLower(s1));
        System.out.println(removeSpaces(s1));
        System.out.println(pal(s1));
        sc.close();
    }

    public static int CountDigits(String text){
        int numb = 0;
        for(int i=0; i < text.length(); i++) {
            Boolean flag = Character.isDigit(text.charAt(i));
            if (flag){
                numb += 1;
            }
        }
        return numb;
    }
    public static int CountSpaces(String text){
        int numb = 0;
        for(int i=0; i < text.length(); i++) {
            Boolean flag = Character.isWhitespace(text.charAt(i));
            if (flag){
                numb += 1;
            }
        }
        return numb;
    }
    public static String CountLower(String text){
        int numb = 0;
        String c1 = "Tudo Minusculas";
        String c2 = "Existem Maiusculas";
        for(int i=0; i < text.length(); i++) {
            text = text.replaceAll( "\\s+", "");
            Boolean flag = Character.isLowerCase(text.charAt(i));
            if (flag){
                numb += 1;
            }
        }
        if ((numb) == text.length()){
            return c1;
        }
        else{
            return c2;
        }
    }
    public static String removeSpaces(String text){
        text = text.trim().replaceAll( "\\s+", " ");
        return text;
    }
    public static String pal(String text){
        int length = text.length();
        String reverse = "";
        String s_1 = "É Palindromo";
        String s_2 = "Não é Palindromo";
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + text.charAt(i);
        if (text.equals(reverse)){
            return s_1;
        }
        else{
            return s_2;
        }
    }
}
