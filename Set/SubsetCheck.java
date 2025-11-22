package com.set;

import java.util.*;

public class SubsetCheck {

    public static <T> boolean isSubset(Set<T> small, Set<T> big) {
        return big.containsAll(small);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Is Set1 a subset of Set2? " + isSubset(set1, set2));
    }
}