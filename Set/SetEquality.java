package com.set;

import java.util.*;

public class SetEquality {

    public static <T> boolean areEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are Equal? " + areEqual(set1, set2));
    }
}