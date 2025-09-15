
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

 
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

   
    public abstract double calculateDiscount();

   
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}


class Electronics extends Product implements Taxable {
    private int warrantyYears;

    public Electronics(int productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}


class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5% VAT";
    }
}


class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}


public class ECommercePlatform {
    
    public static void calculateFinalPrice(Product product) {
        product.displayProductInfo();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            tax = taxable.calculateTax();
            System.out.println(taxable.getTaxDetails());
        }

        double finalPrice = product.getPrice() + tax - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(101, "Laptop", 60000, 2);
        Product p2 = new Clothing(102, "T-Shirt", 1500, "M");
        Product p3 = new Groceries(103, "Apples", 200, "2025-10-01");

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            calculateFinalPrice(p);
        }
    }
}
