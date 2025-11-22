package com.Queue;
import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int compareTo(Team t) {
        return Integer.compare(t.points, this.points);
    }

    public String toString() {
        return name + " (" + points + " pts)";
    }
}

class Match {
    String teamA;
    String teamB;

    Match(String a, String b) {
        teamA = a;
        teamB = b;
    }

    public String toString() {
        return teamA + " vs " + teamB;
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

public class TournamentScheduler {
    public static void main(String[] args) {

        Set<Team> registeredTeams = new HashSet<>();
        Queue<Match> matchQueue = new LinkedList<>();
        List<Result> matchResults = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        registeredTeams.add(new Team("Team A", 0));
        registeredTeams.add(new Team("Team B", 0));
        registeredTeams.add(new Team("Team C", 0));

        matchQueue.add(new Match("Team A", "Team B"));
        matchQueue.add(new Match("Team B", "Team C"));
        matchQueue.add(new Match("Team A", "Team C"));

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            String winner = m.teamA;
            matchResults.add(new Result(winner));

            for (Team t : registeredTeams) {
                if (t.name.equals(winner))
                    t.points += 3;
            }
        }

        leaderboard.addAll(registeredTeams);

        System.out.println("Registered Teams:");
        for (Team t : registeredTeams) System.out.println(t);

        System.out.println("\nMatch Results:");
        for (Result r : matchResults) System.out.println(r);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}