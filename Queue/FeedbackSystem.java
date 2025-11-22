package com.Queue;

import java.util.*;

public class FeedbackSystem {
    public static void main(String[] args) {

        List<String> allFeedback = new ArrayList<>();
        Set<String> uniqueFeedback = new HashSet<>();
        Queue<String> processQueue = new LinkedList<>();
        Stack<String> recentFeedback = new Stack<>();

        addFeedback("Great service!", allFeedback);
        addFeedback("Poor packaging", allFeedback);
        addFeedback("Great service!", allFeedback);
        addFeedback("Fast delivery", allFeedback);

        for (String fb : allFeedback) {
            if (uniqueFeedback.add(fb)) {
                processQueue.add(fb);
            }
        }

        while (!processQueue.isEmpty()) {
            String fb = processQueue.poll();
            recentFeedback.push(fb);
        }

        System.out.println("All Feedback:");
        System.out.println(allFeedback);

        System.out.println("\nUnique Feedback:");
        System.out.println(uniqueFeedback);

        System.out.println("\nRecent Feedback Stack:");
        for (String fb : recentFeedback) System.out.println(fb);
    }

    static void addFeedback(String msg, List<String> list) {
        list.add(msg);
    }
}