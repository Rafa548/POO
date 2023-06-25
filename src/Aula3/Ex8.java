package Aula3;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        double[][] notas = new double[16][2];
        Random rand = new Random();

        //[ [nota teorica, nota pratica], ...]
        for (int i = 0; i < notas.length; i++){
            
            notas[i][0] = rand.nextFloat() * (20);
            notas[i][1] = rand.nextFloat() * (20);


        }

        System.out.format("%5s %5s %5s \n", "NotaT", "NotaP", "Pauta");
        for (int i = 0; i < notas.length; i++){
            if (notas[i][0] <=7.0 || notas[i][1] <= 7.0) {
                System.out.format("%5.1f %5.1f %5s \n", notas[i][0], notas[i][1], "66");
            } else {
                double notaF = 0.4 * notas[i][0] + 0.6 * notas[i][1];
                System.out.format("%5.1f %5.1f %5.0f \n", notas[i][0], notas[i][1], notaF);
            }
        }
    }
}
