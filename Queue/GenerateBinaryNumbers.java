package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("First " + n + " binary numbers: ");
        generate(n);
    }
}