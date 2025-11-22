package com.Queue;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return s.marks - this.marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class CollegeAdmissionSystem {
    public static void main(String[] args) {

        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQueue = new LinkedList<>();
        TreeSet<Student> meritList = new TreeSet<>();

        applicants.add(new Student("Amit", 85));
        applicants.add(new Student("Riya", 92));
        applicants.add(new Student("Sam", 78));
        applicants.add(new Student("Amit", 85));

        for (Student s : applicants) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }

        for (Student s : shortlisted) {
            interviewQueue.add(s);
        }

        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            meritList.add(s);
        }

        System.out.println("Applicants:");
        for (Student s : applicants) System.out.println(s);

        System.out.println("\nShortlisted:");
        for (Student s : shortlisted) System.out.println(s);

        System.out.println("\nMerit List:");
        for (Student s : meritList) System.out.println(s);
    }
}