package com.Queue;

import java.util.*;

class Movie {
    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String toString() {
        return title + " (" + genre + ")";
    }
}

public class StreamingHistorySystem {
    public static void main(String[] args) {

        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> genresWatched = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("KGF", "Action"));
        allMovies.add(new Movie("3 Idiots", "Comedy"));
        allMovies.add(new Movie("Avatar", "Fantasy"));

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));

        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            watchHistory.push(current);
            genresWatched.add(current.genre);
        }

        System.out.println("Watch History:");
        for (Movie m : watchHistory) System.out.println(m);

        System.out.println("\nGenres Watched:");
        System.out.println(genresWatched);

        System.out.println("\nRecommendations:");
        for (Movie m : allMovies) {
            if (!genresWatched.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}