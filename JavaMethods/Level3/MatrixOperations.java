import java.util.Scanner;

public class MatrixOperations {

    
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }

    
    public static int[][] add(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

 
    public static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < B.length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }


    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter rows and cols for matrix: ");
        int r = sc.nextInt(), c = sc.nextInt();

       
        int[][] A = createMatrix(r, c);
        int[][] B = createMatrix(r, c);

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nA + B:");
        printMatrix(add(A, B));

        System.out.println("\nA - B:");
        printMatrix(subtract(A, B));

       
        System.out.println("\nA x B (if possible):");
        if (A[0].length == B.length)
            printMatrix(multiply(A, B));
        else
            System.out.println("Matrix multiplication not possible!");

        sc.close();
    }
}
