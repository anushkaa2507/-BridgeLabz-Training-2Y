package Map_Interface;

import java.nio.file.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws Exception {
    	String text = Files.readString(Path.of("src/input.txt"));

        text = text.replaceAll("[^a-z0-9\\s]", " ");
        String[] words = text.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println(freq);
    }
}