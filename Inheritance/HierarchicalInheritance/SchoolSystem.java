
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}


class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}


class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in " + department + " department");
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Anu", 35, "Mathematics");
        Student s = new Student("saloni", 16, "10th Grade");
        Staff st = new Staff("ananya", 40, "Administration");

        t.displayInfo();
        t.displayRole();

        s.displayInfo();
        s.displayRole();

        st.displayInfo();
        st.displayRole();
    }
}
