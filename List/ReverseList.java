package com.list;

import java.util.*;

public class ReverseList {
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        ListIterator<T> itr = list.listIterator(list.size()); // Start at the end

        while (itr.hasPrevious()) {
            reversed.add(itr.previous());
        }
        return reversed;
    }

    public static void main(String[] args) {

        System.out.println("=== Reverse List Program ===");

        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        List<Integer> reversedArray = reverseArrayList(arrayList);
        LinkedList<Integer> reversedLinked = reverseLinkedList(linkedList);

        System.out.println("Original ArrayList : " + arrayList);
        System.out.println("Reversed ArrayList : " + reversedArray);

        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinked);
    }
}