class Book {
    String title;
    String author;
    double price;

    
    Book() {
        title = "The Summer I turned pretty";
        author = "Jenny Han";
        price = 0.0;
    }


    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();  
        Book b2 = new Book("1984", "George Orwell", 299.99); 

        b1.display();
        b2.display();
    }
}
