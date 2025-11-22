package scenerio_based;

import java.util.*;

public class VotingCount {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] votingSequence = {
            "Alice", "Bob", "Alice", "Charlie", "Bob",
            "Alice", "Charlie", "Bob", "Bob", "Alice"
        };

        for (String candidate : votingSequence) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> e : votes.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());

        System.out.println("\nWinner: " + winner);
    }
}