package com.list;

import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (set.add(item)) {   
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(list);

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + result);
    }
}