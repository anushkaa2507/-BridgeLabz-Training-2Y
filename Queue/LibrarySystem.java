package com.Queue;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        addBook("The Alchemist", "Coelho", books);
        addBook("Ramayan", "Valmiki", books);
        addBook("Mahabharat", "Vyasa", books);

        registerMember("M1", members);
        registerMember("M2", members);
        registerMember("M1", members);

        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            returned.push(b);
        }

        Book reissue = null;
        if (!returned.isEmpty()) {
            reissue = returned.pop();
        }

        System.out.println("Books:");
        for (Book b : books) System.out.println(b);

        System.out.println("\nMembers:");
        System.out.println(members);

        System.out.println("\nReturned Stack:");
        for (Book b : returned) System.out.println(b);

        System.out.println("\nReissued:");
        System.out.println(reissue);
    }

    static void addBook(String title, String author, List<Book> list) {
        list.add(new Book(title, author));
    }

    static void registerMember(String id, Set<String> members) {
        members.add(id);
    }
}