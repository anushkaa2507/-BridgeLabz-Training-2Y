class Book {

    static String libraryName = "City Central Library";

    final String isbn;

    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Book Title   : " + title);
        System.out.println("Author       : " + author);
        System.out.println("ISBN         : " + isbn);
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN12345");
        Book book2 = new Book("1984", "George Orwell", "ISBN54321");

        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        System.out.println();

        if (book2 instanceof Book) {
            book2.displayDetails();
        }

        System.out.println();

        Book.displayLibraryName();
    }
}