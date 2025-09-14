// Base class
class Book {
    public String ISBN;       // public
    protected String title;   // protected
    private String author;    // private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author (private field)
    public String getAuthor() {
        return author;
    }

    // Setter for author (private field)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void display() {
        System.out.println("ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method showing access to public (ISBN) and protected (title)
    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN +  // public access
                           ", Title: " + title +    // protected access
                           ", File Size: " + fileSize + "MB");
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-0451524935", "1984", "George Orwell");
        b1.display();

        // Modify private author using setter
        b1.setAuthor("Orwell");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb1 = new EBook("978-1491950357", "Learning Java", "Marc Loy", 5.6);
        eb1.display();
        eb1.displayEBookDetails();
    }
}
