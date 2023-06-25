package Aula4;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String Usrinput;
        System.out.println("Escreva uma frase:");
        Usrinput = sc.nextLine();
        sc.close();
        System.out.printf("Numero de digitos: %d\n", CountNumbers(Usrinput));
        System.out.printf("Numero de espaços: %d\n", SpaceCount(Usrinput));
        System.out.printf("So minusculas: %s\n", MinOnly(Usrinput));
        System.out.printf("String sem 2 ou mais espaços: %s\n", OneSpaceOnly(Usrinput));
        System.out.printf("Palindrome: %s\n", IsPalindrome(Usrinput));
    }

    public static int CountNumbers(String input) {
        int digits = 0; 
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                digits += 1;
            }
        }
        return digits;
    }
    
    public static int SpaceCount(String input) {
        int space = 0;
        for(char ch : input.toCharArray()){
            if(ch == ' '){
                space += 1;
            }
        }
        return space;
    }

    public static boolean MinOnly(String input) {
        boolean ver = true;
        for(char ch : input.toCharArray()){
            if(!Character.isLowerCase(ch)){
                ver = false;
            }
        }
        return ver;
    }
    public static String OneSpaceOnly(String input) {
        String inputwithlessspaces = "";
        boolean waslastsapce = false;
        for(char ch : input.toCharArray()){
            if (ch == ' ') {
                if(!waslastsapce){
                    inputwithlessspaces += ch;
                    waslastsapce = true;
                }
            } else {
                inputwithlessspaces += ch;
                waslastsapce = false;
            }
        }
        return inputwithlessspaces;
    }

    public static boolean IsPalindrome(String input) {
        int length = input.length();
        String inputlower = input.toLowerCase(), reverseinput = "";
        for(int i = length-1; i>=0; i--) {
            reverseinput += inputlower.charAt(i);
        }
        if(inputlower.equals(reverseinput)){
            return true;
        }
        return false;
    }
}

