public class Course {

    String courseName;
    int duration; 
    double fee;

    static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void courseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration     : " + duration + " hours");
        System.out.println("Fee          : $" + fee);
        System.out.println("Institute    : " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 40, 300);
        Course c2 = new Course("Python Programming", 35, 280);

        c1.courseDetails();
        System.out.println();

        c2.courseDetails();
        System.out.println();

        Course.updateInstituteName("Tech Academy");

        System.out.println();

        c1.courseDetails();
        System.out.println();

        c2.courseDetails();
    }
}