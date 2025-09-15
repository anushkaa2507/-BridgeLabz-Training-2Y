
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}


abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

  
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

   
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

  
    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + 
                           ", Type: " + type + 
                           ", Rate per day: " + rentalRate);
    }
}


class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: [Confidential]";
    }
}


class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: [Confidential]";
    }
}


class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: [Confidential]";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR123", 2000, "POL123");
        Vehicle v2 = new Bike("BIKE456", 500, "POL456");
        Vehicle v3 = new Truck("TRUCK789", 5000, "POL789");

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.displayDetails();
            int days = 5;
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("---------------------------");
        }
    }
}
