
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}


class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}


class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration; 

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, Internship Duration: " + duration + " months");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager("Anu", 101, 80000, 10);
        Developer d = new Developer("Kunal", 102, 60000, "Java");
        Intern i = new Intern("ashi", 103, 20000, 6);

        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println();
        i.displayDetails();
    }
}
