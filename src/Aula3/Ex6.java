package Aula3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datainput;
        String[] arrData;
        int[] intData = new int[2];
        do {
            System.out.println("Data? (mm/aaaa)");
            datainput = sc.next();
            if(datainput.contains("/")){
                arrData = datainput.split("/");
                for(int i = 0; i<arrData.length; i++){
                    intData[i] = Integer.parseInt(arrData[i]);
                }
            }    
        } while (intData.length == 0 || intData[0] < 1 || intData[0] > 12);
        sc.close();
        switch (intData[0]) {
            case 2:
            if (intData[1] % 100 == 0) {
                if(intData[1] % 400 == 0){
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                } 
            } else {
                if(intData[1] % 4 == 0){
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                } 
            }
                break; 
            case 4:
            case 6:
            case 9:
            case 11: 
                System.out.println("30 Days");
                break;

            default:
                System.out.println("31 Days");
                break;
        }
    }    
}
