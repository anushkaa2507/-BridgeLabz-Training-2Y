import java.util.Scanner;

public class StudentVote {

  
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        } else if (age >= 18) {
            return true;  
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVote svc = new StudentVote();

        int[] ages = new int[10]; 

        
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");

      
        for (int i = 0; i < ages.length; i++) {
            boolean eligible = svc.canStudentVote(ages[i]);
            if (eligible) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote.");
            }
        }

        sc.close();
    }
}
