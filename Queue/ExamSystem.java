package com.Queue;
import java.util.*;

public class ExamSystem {

    private List<Question> questions = new ArrayList<>();
    private Set<String> uniqueStudents = new HashSet<>();
    private Queue<Student> examQueue = new LinkedList<>();
    private Stack<Question> questionStack = new Stack<>();

    public void enrollStudent(Student student) {
        if (uniqueStudents.add(student.getStudentId())) {
            examQueue.add(student);
        }
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void randomizeQuestions() {
        Collections.shuffle(questions);
    }

    public void loadQuestionStack() {
        for (Question q : questions) {
            questionStack.push(q);
        }
    }

    public void serveStudents() {
        System.out.println("\nServing Students:");
        while (!examQueue.isEmpty()) {
            System.out.println(examQueue.remove());
        }
    }

    public void navigateQuestions() {
        System.out.println("\nNavigating Questions:");
        while (!questionStack.isEmpty()) {
            System.out.println("Viewing: " + questionStack.pop());
        }
    }
}