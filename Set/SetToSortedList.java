package com.set;
import java.util.*;

public class SetToSortedList {

    public static List<Integer> convert(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list); 
        return list;
    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sortedList = convert(set);

        System.out.println("Original Set: " + set);
        System.out.println("Sorted List: " + sortedList);
    }
}