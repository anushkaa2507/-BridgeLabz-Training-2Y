import java.util.Arrays;

public class FootballTeam {

    
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }
        return heights;
    }

    
    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

   
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    
    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

   
    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();

        
        int[] heights = team.generateHeights(11);
        System.out.println("Heights of players: " + Arrays.toString(heights));

        
        int shortest = team.findShortest(heights);
        int tallest = team.findTallest(heights);
        double mean = team.findMean(heights);

        
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }
}
