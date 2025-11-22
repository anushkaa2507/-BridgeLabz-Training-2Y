package com.Queue;

public class ExamMain {

    public static void main(String[] args) {

        ExamSystem exam = new ExamSystem();

        exam.enrollStudent(new Student("S101", "Aarav"));
        exam.enrollStudent(new Student("S102", "Meera"));
        exam.enrollStudent(new Student("S101", "Aarav"));

        exam.addQuestion(new Question("What is Java?"));
        exam.addQuestion(new Question("Define OOP."));
        exam.addQuestion(new Question("Explain polymorphism."));

        exam.randomizeQuestions();
        exam.loadQuestionStack();

        exam.serveStudents();
        exam.navigateQuestions();
    }
}