package generic_assignment;

import java.util.*;

abstract class CourseType {
    String name;
    CourseType(String n) { name = n; }
    public String toString() { return name; }
}

class ExamCourse extends CourseType {
    ExamCourse(String n) { super(n); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String n) { super(n); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String n) { super(n); }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T c) {
        courses.add(c);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void printAll(List<? extends CourseType> list) {
        for (CourseType c : list) System.out.println(c);
    }

    public static void main(String[] args) {
        Course<ExamCourse> e = new Course<>();
        e.addCourse(new ExamCourse("Math Exam"));
        e.addCourse(new ExamCourse("Physics Exam"));

        Course<AssignmentCourse> a = new Course<>();
        a.addCourse(new AssignmentCourse("Java Assignment"));
        a.addCourse(new AssignmentCourse("DBMS Assignment"));

        Course<ResearchCourse> r = new Course<>();
        r.addCourse(new ResearchCourse("AI Research"));
        r.addCourse(new ResearchCourse("ML Research"));

        printAll(e.getCourses());
        printAll(a.getCourses());
        printAll(r.getCourses());
    }
}