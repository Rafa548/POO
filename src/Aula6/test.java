package Aula6;
import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {
        for(int i = 4; i < 7; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            System.out.println(randomNum);
        } 
    }

}
