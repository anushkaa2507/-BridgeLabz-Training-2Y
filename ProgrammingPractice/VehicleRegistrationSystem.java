class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration No.  : " + registrationNumber);
        System.out.println("Registration Fee  : $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("REG123", "Alice", "Car");
        Vehicle v2 = new Vehicle("REG456", "Bob", "Bike");

        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        System.out.println();

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }

        System.out.println();

        Vehicle.updateRegistrationFee(750.0);

        System.out.println();

        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }
    }
}