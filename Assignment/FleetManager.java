package generic_assignment;
import java.util.*;

class Vehicle {
    String name;
    Vehicle(String n) { name = n; }
    public String toString() { return name; }
}

class Truck extends Vehicle {
    Truck(String n) { super(n); }
}

class Bike extends Vehicle {
    Bike(String n) { super(n); }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T v) {
        fleet.add(v);
    }

    public void showFleet() {
        for (T v : fleet) System.out.println(v);
    }

    public static void main(String[] args) {
        FleetManager<Truck> fm1 = new FleetManager<>();
        fm1.addVehicle(new Truck("Truck1"));
        fm1.addVehicle(new Truck("Truck2"));
        fm1.showFleet();

        FleetManager<Bike> fm2 = new FleetManager<>();
        fm2.addVehicle(new Bike("Bike1"));
        fm2.showFleet();
    }
}