package scenerio_based;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
