package generic_assignment;
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class ProductType<T> {
    T category;
    String name;
    double price;

    ProductType(T category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

class Marketplace {

    public static <T extends ProductType<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }

    public static void main(String[] args) {
        ProductType<BookCategory> b = new ProductType<>(new BookCategory(), "Java Book", 500);
        ProductType<ClothingCategory> c = new ProductType<>(new ClothingCategory(), "T-Shirt", 300);
        ProductType<GadgetCategory> g = new ProductType<>(new GadgetCategory(), "Smartwatch", 2000);

        applyDiscount(b, 10);
        applyDiscount(c, 20);
        applyDiscount(g, 15);

        System.out.println(b);
        System.out.println(c);
        System.out.println(g);
    }
}