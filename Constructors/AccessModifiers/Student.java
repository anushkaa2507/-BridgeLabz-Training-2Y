
class Student {
    public int rollNumber;      
    protected String name;      
    private double CGPA;     

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

   
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }

    
    public void display() {
        System.out.println("Roll No: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {
    String thesisTopic;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

  
    public void displayPGDetails() {
        System.out.println("Postgraduate Student: " + name +
                           ", Thesis Topic: " + thesisTopic);
    }
}


public class Student {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.display();

        
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Cloud Computing");
        pg1.display();
        pg1.displayPGDetails();
    }
}
