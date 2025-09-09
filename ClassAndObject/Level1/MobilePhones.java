class MobilePhones {
    String brand;
    String model;
    double price;

    MobilePhones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhones phone1 = new MobilePhones("Apple", "iPhone 15", 120000);
        MobilePhones phone2 = new MobilePhones("Samsung", "Galaxy S24", 95000);

        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}
