package Aula12.Ex1;

import java.util.*;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> All_words = new ArrayList<>();
        ArrayList<String> Unique_words = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next();
            All_words.add(word);
            if (!Unique_words.contains(word)) {
                Unique_words.add(word);
            }
        }
        System.out.println("Quantiadde de palavras -> " + All_words.size());
        System.out.println("Quantiadde de palavras unicas -> " + Unique_words.size());
    }
}
    

