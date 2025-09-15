import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}


abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory;

  
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

  
    public abstract double calculateBill();

    
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId +
                           ", Name: " + name +
                           ", Age: " + age);
    }
}


class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String rec : getMedicalHistory()) {
            System.out.println("- " + rec);
        }
    }
}


class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String rec : getMedicalHistory()) {
            System.out.println("- " + rec);
        }
    }
}


public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Alice", 30, 5, 2000);
        Patient p2 = new OutPatient("P002", "Bob", 40, 500);

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                record.addRecord("Initial checkup completed.");
                record.addRecord("Prescribed medication.");
                record.viewRecords();
            }

            System.out.println("-----------------------");
        }
    }
}