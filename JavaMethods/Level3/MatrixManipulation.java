import java.util.Scanner;

public class MatrixManipulation {

    
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 10); 
        return matrix;
    }

    
    public static void printMatrix(double[][] M) {
        for (double[] row : M) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

   
    public static int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                T[j][i] = A[i][j];
        return T;
    }

  
    public static int determinant2x2(int[][] A) {
        return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
    }

  
    public static int determinant3x3(int[][] A) {
        int det = A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        return det;
    }

   
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) {
            System.out.println("Matrix has no inverse (det=0).");
            return null;
        }
        double[][] inv = {
            { A[1][1] / (double)det, -A[0][1] / (double)det },
            { -A[1][0] / (double)det, A[0][0] / (double)det }
        };
        return inv;
    }

    
    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        if (det == 0) {
            System.out.println("Matrix has no inverse (det=0).");
            return null;
        }

        double[][] inv = new double[3][3];
        inv[0][0] = (A[1][1]*A[2][2] - A[1][2]*A[2][1]) / (double)det;
        inv[0][1] = (A[0][2]*A[2][1] - A[0][1]*A[2][2]) / (double)det;
        inv[0][2] = (A[0][1]*A[1][2] - A[0][2]*A[1][1]) / (double)det;

        inv[1][0] = (A[1][2]*A[2][0] - A[1][0]*A[2][2]) / (double)det;
        inv[1][1] = (A[0][0]*A[2][2] - A[0][2]*A[2][0]) / (double)det;
        inv[1][2] = (A[0][2]*A[1][0] - A[0][0]*A[1][2]) / (double)det;

        inv[2][0] = (A[1][0]*A[2][1] - A[1][1]*A[2][0]) / (double)det;
        inv[2][1] = (A[0][1]*A[2][0] - A[0][0]*A[2][1]) / (double)det;
        inv[2][2] = (A[0][0]*A[1][1] - A[0][1]*A[1][0]) / (double)det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] A = createMatrix(n, n);
        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nTranspose of A:");
        printMatrix(transpose(A));

        if (n == 2) {
            System.out.println("\nDeterminant of A: " + determinant2x2(A));
            double[][] inv = inverse2x2(A);
            if (inv != null) {
                System.out.println("Inverse of A:");
                printMatrix(inv);
            }
        } else if (n == 3) {
            System.out.println("\nDeterminant of A: " + determinant3x3(A));
            double[][] inv = inverse3x3(A);
            if (inv != null) {
                System.out.println("Inverse of A:");
                printMatrix(inv);
            }
        }

        sc.close();
    }
}
