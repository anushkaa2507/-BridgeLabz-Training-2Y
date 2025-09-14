public class Product {
    
    String productName;
    double price;

    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  
    }

    public void productDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : $" + price);
    }

    public static void totalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 800.00);

        p1.productDetails();
        System.out.println();

        p2.productDetails();
        System.out.println();

        Product.totalProducts();
    }
}