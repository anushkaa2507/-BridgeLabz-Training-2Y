import java.util.Scanner;

public class ScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 41) + 60; 
            }
        }
        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }


    public static String[] calculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else if (percent >= 50) grades[i] = "E";
            else grades[i] = "F";
        }
        return grades;
    }


    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-8s%-10s%-12s%-10s%-10s%-12s%-12s%-12s%-8s%n",
                "StuNo", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d%-10d%-12d%-10d%-10.0f%-12.2f%-12.2f%-8s%n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

      
        int[][] scores = generateScores(n);

        
        double[][] results = calculateResults(scores);

        String[] grades = calculateGrades(results);

       
        displayScorecard(scores, results, grades);

        sc.close();
    }
}
