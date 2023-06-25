package Aula2;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int secs, mins;
        Scanner sc = new Scanner(System.in);
        System.out.print("Seconds? : ");
        secs = sc.nextInt();
        sc.close();
        mins = secs/60;
        //String hours = String.format("%02d", mins/60);
        //String finalsecs = String.format("%02d",secs%60);
        //String finalmins = String.format("%02d",mins%60);
        System.out.format("%02d:%02d:%02d", mins/60, mins%60, secs%60);
    }
}
