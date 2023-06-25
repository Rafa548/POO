package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException {
        ArrayList <String> list = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("ex2.java")); //copiar do ex2 da aula 10 para a pasta do projeto
        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                list.add(word);
            }
        }
        System.out.println(list);
        for (int i = 0; i<list.size(); i++) {
            String word = list.get(i);
            if (word.endsWith("s")) {
                System.out.println(word);
            }    
            if (!word.matches("[\\w]+")) {
                list.remove(i);
                i -= 1;
            }
        }

        System.out.println(list);
    }
}
