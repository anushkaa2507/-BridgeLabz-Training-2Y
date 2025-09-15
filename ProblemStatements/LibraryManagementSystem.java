
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}


abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; 
    private boolean isAvailable;

    
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected String getBorrower() {
        return borrower;
    }

    protected void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

   
    public abstract int getLoanDuration();

    
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId +
                           ", Title: " + title +
                           ", Author: " + author +
                           ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}


class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}


class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}


class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B001", "Effective Java", "Joshua Bloch");
        LibraryItem item2 = new Magazine("M001", "National Geographic", "Various");
        LibraryItem item3 = new DVD("D001", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem("Alice");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println("-------------------------");
        }
    }
}
