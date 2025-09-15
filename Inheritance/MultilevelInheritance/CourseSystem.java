
class Course {
    String courseName;
    int duration; 

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}


class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayOnlineInfo() {
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayPaidInfo() {
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + finalFee);
    }
}


public class CourseSystem {
    public static void main(String[] args) {
        Course c = new Course("Mathematics Basics", 8);
        OnlineCourse oc = new OnlineCourse("Java Programming", 10, "Udemy", true);
        PaidOnlineCourse poc = new PaidOnlineCourse("Data Science Masterclass", 12, "Coursera", true, 5000, 20);

        c.displayInfo();
        System.out.println();

        oc.displayInfo();
        oc.displayOnlineInfo();
        System.out.println();

        poc.displayInfo();
        poc.displayOnlineInfo();
        poc.displayPaidInfo();
    }
}
