package Aula3;
import java.util.Scanner;
import java.util.Random;

public class Ex7 {
    
    public static void main(String[] args) {
        int secret;
        boolean cont;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        do {
            secret = rand.nextInt(1,101);
            cont = game(secret, sc);
        }while(cont);
    }

    private static boolean game(int secret, Scanner sc ){
        int guess;
        while(true){
            System.out.println("Tentativa?");
            guess = sc.nextInt();
            if(guess > secret){
                System.out.println("Alto");
            } else if (guess < secret){
                System.out.println("Baixo");
            } else {
                System.out.println("Certo!");
                break;
            }
        }
        System.out.println("Deseja continuar?");
        String respota = sc.next();
        if (respota.equals("S") || respota.equals("Sim")){
            return true;
        } else {
            return false;
        }
    }
}
