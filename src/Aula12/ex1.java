package Aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new java.util.HashMap<>();
        int numberofWords = 0;
        Scanner input = new Scanner(new FileReader("src/Aula12/ex1.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.replaceAll("[.!?\\-]", "");
            String[] words = line.trim().split("[\s]+");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
                if (map.containsKey(words[i])) {
                    map.put(words[i], map.get(words[i]) + 1);
                } else {
                    map.put(words[i], 1);
                }
            }
        }
        for (String key : map.keySet()) {
            numberofWords += map.get(key);
        }
        System.out.println("Número Total de Palavras: " + numberofWords);
        System.out.println("Número de Diferentes Palavras: " + map.size());
    }
}
