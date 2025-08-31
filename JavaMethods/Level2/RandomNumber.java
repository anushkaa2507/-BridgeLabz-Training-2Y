import java.util.Arrays;

public class RandomNumber {

    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            
            numbers[i] = (int) (1000 + Math.random() * 9000);
        }
        return numbers;
    }

 
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;


        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumber obj = new RandomNumber();

        
        int[] randomNumbers = obj.generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));

        double[] results = obj.findAverageMinMax(randomNumbers);

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
