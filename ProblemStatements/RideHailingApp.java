
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    public String getLocation() {
        return currentLocation;
    }

    
    
    public abstract double calculateFare(double distance);

    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId +
                           ", Driver: " + driverName +
                           ", Rate per km: " + ratePerKm +
                           ", Current Location: " + currentLocation);
    }
}


class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; 
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}


class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

public class RideHailingApp {
   
    public static void processRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        double fare = v.calculateFare(distance);
        System.out.println("Calculated Fare for " + distance + " km: " + fare);

        if (v instanceof GPS) {
            GPS gps = (GPS) v;
            System.out.println("Current Location: " + gps.getCurrentLocation());
            gps.updateLocation("New Destination");
            System.out.println("Updated Location: " + gps.getCurrentLocation());
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR101", "Alice", 15, "Downtown");
        Vehicle v2 = new Bike("BIKE202", "Bob", 8, "City Center");
        Vehicle v3 = new Auto("AUTO303", "Charlie", 10, "Station Road");

        Vehicle[] rides = {v1, v2, v3};

        for (Vehicle v : rides) {
            processRide(v, 12); 
        }
    }
}
