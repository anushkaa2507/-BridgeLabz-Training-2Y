class Product {

    static double discount = 10.0;  

    final int productID;

    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID    : " + productID);
        System.out.println("Product Name  : " + productName);
        System.out.println("Price         : $" + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Discount      : " + discount + "%");
        double discountedPrice = price - (price * discount / 100);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 1000.0, 2);
        Product p2 = new Product(2, "Headphones", 200.0, 1);

        if (p1 instanceof Product) {
            p1.displayProduct();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayProduct();
        }

        System.out.println();

        Product.updateDiscount(15.0);

        System.out.println();

        if (p1 instanceof Product) {
            p1.displayProduct();
        }
    }
}