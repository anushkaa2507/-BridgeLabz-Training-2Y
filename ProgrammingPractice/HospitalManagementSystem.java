class Patient {
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayDetails() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient ID    : " + patientID);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Ailment       : " + ailment);
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "John Doe", 45, "Fever");
        Patient p2 = new Patient(2, "Jane Smith", 30, "Fracture");

        if (p1 instanceof Patient) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        System.out.println();

        Patient.getTotalPatients();
    }
}