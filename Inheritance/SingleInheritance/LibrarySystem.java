
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title + ", Published: " + publicationYear);
    }
}


class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        Author a = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");
        a.displayInfo();
    }
}
