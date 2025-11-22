package generic_assignment;
import java.util.*;

abstract class JobRole {
    String title;
    JobRole(String t) { title = t; }
    public String toString() { return title; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
    public String toString() { return role.toString() + " Resume"; }
}

class ResumeSystem {

    public static void processAll(List<? extends JobRole> list) {
        for (JobRole r : list) System.out.println(r);
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>(new DataScientist());
        Resume<ProductManager> r3 = new Resume<>(new ProductManager());

        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        processAll(roles);
    }
}