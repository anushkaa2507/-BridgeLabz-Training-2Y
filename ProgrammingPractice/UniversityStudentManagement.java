
class Student {
   
    static String universityName = "Global University";

   
    private static int totalStudents = 0;


    private final int rollNumber;

    private String name;
    private String grade;

   
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber; 
        this.name = name;
        this.grade = grade;

        totalStudents++; 
    }

  
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

   
    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student st = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + st.rollNumber);
            System.out.println("Name: " + st.name);
            System.out.println("Grade: " + st.grade);
            System.out.println("----------------------------");
        } else {
            System.out.println("Provided object is not a Student.");
        }
    }


    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student st = (Student) obj;
            st.grade = newGrade;
            System.out.println("Grade updated for " + st.name + " to " + newGrade);
        } else {
            System.out.println("Cannot update grade. Provided object is not a Student.");
        }
    }
}


public class UniversityStudentManagement {
    public static void main(String[] args) {
        
        Student s1 = new Student(1, "Anushka", "A");
        Student s2 = new Student(2, "Rohan", "B");

      
        s1.displayDetails(s1);
        s2.displayDetails(s2);

        
        s1.updateGrade(s1, "A+");

       
        s1.displayDetails(s1);

        
        String notAStudent = "Hello";
        s2.displayDetails(notAStudent);
        s2.updateGrade(notAStudent, "C");

        
        Student.displayTotalStudents();
    }
}
