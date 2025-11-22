package com.list;

import java.util.*;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) fast.next();
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        String result = findNthFromEnd(list, n);

        System.out.println("Original List: " + list);
        System.out.println(n + "nd element from end: " + result);
    }
}