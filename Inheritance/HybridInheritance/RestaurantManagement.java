
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


interface Worker {
    void performDuties();
}


class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking dishes.");
    }
}


class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}


public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("Ramesh", 101);
        Worker waiter = new Waiter("Suresh", 102);

        ((Person) chef).displayInfo();
        chef.performDuties();

        ((Person) waiter).displayInfo();
        waiter.performDuties();
    }
}
