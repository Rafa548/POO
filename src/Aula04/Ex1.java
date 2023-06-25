package Aula04;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma frase: ");
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        int n = s1.length();
        char lastC = s1.charAt(n-1);
        String SemEspaço = s1.replaceAll(" ", "");
        String replace = s1.replace( "a", "b");
        String s3 = s1.toUpperCase();
        int lastCA = s1.lastIndexOf("a");
        System.out.println(s2);                             // 1   
        System.out.println(lastC);                          // 2
        if (s1.length()>=3){
            String tresC = s1.substring(0,3);
            System.out.println(tresC);                      // 3
        }
        else{
            System.out.println("Sem letras suficientes");
        }
        System.out.println(replace);                        // 4
        System.out.println(s3);                             // 4
        if (lastCA == -1){
            System.out.println("Não existe a letra (a)");
        }
        else{
            System.out.println(lastCA);                     // 4
        }
        System.out.println(SemEspaço);                      // 4        
        sc.close();
    }
}
