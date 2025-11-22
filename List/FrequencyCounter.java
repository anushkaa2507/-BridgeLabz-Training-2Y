package com.list;
import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        System.out.println("=== Frequency of Elements ===");

        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = findFrequency(items);
        System.out.println("Input List: " + items);
        System.out.println("Frequency Map: " + result);
    }
}