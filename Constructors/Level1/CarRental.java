class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

   
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        dailyRate = 1000.0;
    }

   
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

   
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName +
                           ", Car: " + carModel +
                           ", Days: " + rentalDays +
                           ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();  
        CarRental r2 = new CarRental("anushka", "Creta", 5, 2000.0);  

        r1.display();
        r2.display();
    }
}
