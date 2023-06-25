package Aula10.Ex4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class word {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> words = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                words.add(word);
            }
        }
        System.out.println("Palavras com mais de 2 caracteres -> " + words);

        System.out.println("Palavras que terminam com s :");
        for (String word : words) {
            if (word.endsWith("s")) {
                System.out.println(word);
            }
        }

        ArrayList<String> words_bad = new ArrayList<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    words_bad.add(word);
                }
            }
        }

        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (words_bad.contains(word)) {
                itr.remove();
            }
        }

        

        System.out.println("Palavras sem numeros ->" + words);
        input.close();

    }
}
