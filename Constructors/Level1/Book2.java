class Book2 {
    String title;
    String author;
    double price;
    boolean available;

   
    Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2("The Alchemist", "Paulo Coelho", 499.99, true);

        b1.display();
        b1.borrowBook(); 
        b1.borrowBook();  
        b1.display();
    }
}
