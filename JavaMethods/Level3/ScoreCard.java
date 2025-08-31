import java.util.Scanner;

public class ScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41 + 60); 
            }
        }
        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3;
            double percentage = ((double) total / 300) * 100;

            
            avg = Math.round(avg * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percentage;
        }
        return results;
    }

   public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

      
        int[][] scores = generateScores(n);

       
        double[][] results = calculateResults(scores);

        
        displayScoreCard(scores, results);

        sc.close();
    }
}
