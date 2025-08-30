import java.util.Scanner;

public class RockPaperScissors {


    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    
    public static String findWinner(String player, String computer) {
        if (player.equalsIgnoreCase(computer)) {
            return "Draw";
        } else if (
            (player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (player.equalsIgnoreCase("Scissors") && computer.equals("Paper")) ||
            (player.equalsIgnoreCase("Paper") && computer.equals("Rock"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    
    public static String[][] calculateStats(String[][] results, int totalGames) {
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            if (results[i][3].equals("Player")) playerWins++;
            else if (results[i][3].equals("Computer")) computerWins++;
        }

        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        String[][] summary = new String[2][3];
        summary[0][0] = "Player";
        summary[0][1] = String.valueOf(playerWins);
        summary[0][2] = String.format("%.2f%%", playerPercentage);

        summary[1][0] = "Computer";
        summary[1][1] = String.valueOf(computerWins);
        summary[1][2] = String.format("%.2f%%", computerPercentage);

        return summary;
    }

    
    public static void displayResults(String[][] results, int totalGames, String[][] stats) {
        System.out.printf("%-8s%-12s%-15s%-12s%n", "Game", "Player", "Computer", "Winner");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < totalGames; i++) {
            System.out.printf("%-8s%-12s%-15s%-12s%n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }

        System.out.println("\nOverall Stats:");
        System.out.printf("%-12s%-12s%-12s%n", "Entity", "Wins", "Win %");
        System.out.println("--------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-12s%-12s%-12s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[totalGames][4];

       
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String playerChoice = sc.nextLine();

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = playerChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }

        String[][] stats = calculateStats(results, totalGames);

       
        displayResults(results, totalGames, stats);

        sc.close();
    }
}
