package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static Queue<Integer> reverse(Queue<Integer> q) {
        if (q.isEmpty()) return q;
        int item = q.remove();
        q = reverse(q);
        q.add(item);
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Original Queue: " + q);
        q = reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}