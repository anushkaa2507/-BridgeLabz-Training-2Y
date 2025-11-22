package generic_assignment;
import java.util.*;

class Product {
    double price;
    Product(double p) { price = p; }
    double getPrice() { return price; }
}

class Mobile extends Product {
    Mobile(double p) { super(p); }
}

class Laptop extends Product {
    Laptop(double p) { super(p); }
}

class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double s = 0;
        for (Product p : items) s += p.getPrice();
        return s;
    }

    public static void main(String[] args) {
        List<Mobile> m = Arrays.asList(new Mobile(20000), new Mobile(15000));
        List<Laptop> l = Arrays.asList(new Laptop(50000), new Laptop(60000));
        System.out.println(calculateTotal(m));
        System.out.println(calculateTotal(l));
    }
}