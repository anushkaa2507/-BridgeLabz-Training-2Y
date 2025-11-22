package com.Queue;

import java.util.*;

class Player {
    String name;
    int points;

    Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Player p = (Player) obj;
        return this.name.equals(p.name);
    }

    public String toString() {
        return name + " (" + points + ")";
    }
}

class Match {
    String team1;
    String team2;

    Match(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    public String toString() {
        return team1 + " vs " + team2;
    }
}

class Result {
    String winner;

    Result(String winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Winner: " + winner;
    }
}

class Score implements Comparable<Score> {
    String name;
    int points;

    Score(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int compareTo(Score s) {
        return s.points - this.points;
    }

    public String toString() {
        return name + ": " + points;
    }
}

public class GameTournament {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        players.add(new Player("A", 10));
        players.add(new Player("B", 20));
        players.add(new Player("A", 10));

        matches.add(new Match("A", "B"));
        matches.add(new Match("C", "D"));

        while (!matches.isEmpty()) {
            Match m = matches.poll();
            results.add(new Result(m.team1));
        }

        leaderboard.add(new Score("A", 30));
        leaderboard.add(new Score("B", 20));
        leaderboard.add(new Score("C", 10));

        System.out.println("Players: " + players);
        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("Leaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}