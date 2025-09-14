public class Vehicle {

    String ownerName;
    String vehicleType;

    static double regFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void vehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : $" + regFee);
    }

    public static void updateRegFee(double newFee) {
        regFee = newFee;
        System.out.println("Registration fee updated to $" + regFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        v1.vehicleDetails();
        System.out.println();

        v2.vehicleDetails();
        System.out.println();

        Vehicle.updateRegFee(120.0);

        System.out.println();

        v1.vehicleDetails();
        System.out.println();

        v2.vehicleDetails();
    }
}