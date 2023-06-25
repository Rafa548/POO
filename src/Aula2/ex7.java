package Aula2;
import java.util.Scanner;


public class ex7 {
    public static void main(String[] args) {
        float[][] points = new float[2][2]; //[[x,y], [x,y]] or [p1,p2]
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < points.length; i++){
            System.out.print("x : ");
            points[i][0] = sc.nextInt();
            System.out.print("y : ");
            points[i][1] = sc.nextInt();
        }
        
        sc.close();
        Double distance = Math.sqrt((points[1][0] - points[0][0])*(points[1][0] - points[0][0])+(points[1][1] - points[0][1])*(points[1][1] - points[0][1]));
        System.out.println(distance);
    }
}
