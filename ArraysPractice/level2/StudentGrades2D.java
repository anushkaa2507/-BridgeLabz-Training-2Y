import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

      
        int[][] marks = new int[number][3];    
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    mark = sc.nextInt();

                    if (mark < 0) {
                        System.out.println("❌ Marks cannot be negative. Try again.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;  
            }

           
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics = " + marks[i][0]);
            System.out.println("  Chemistry = " + marks[i][1]);
            System.out.println("  Maths = " + marks[i][2]);
            System.out.printf("  Percentage = %.2f\n", percentage[i]);
            System.out.println("  Grade = " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
