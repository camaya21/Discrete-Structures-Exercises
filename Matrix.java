import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixA = generateRandomMatrix(3, 4); // 3x4 matrix
        int[][] matrixB = generateRandomMatrix(4, 5); // 4x5 matrix

        System.out.println("Matrix A (3x4):");
        printMatrix(matrixA);
        System.out.println("Matrix B (4x5):");
        printMatrix(matrixB);

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        System.out.println("Result of A * B (3x5):");
        printMatrix(resultMatrix);
    }

    // Method to generate a matrix with random numbers between 1 and 20
    private static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20) + 1; // Random number between 1 and 20
            }
        }
        return matrix;
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Result matrix will have dimensions rowsA x colsB
        int[][] result = new int[rowsA][colsB];

        // Perform multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                // Initialize the sum for result[i][j]
                result[i][j] = 0; 
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t"); // Tab-separated
            }
            System.out.println(); // New line after each row
        }
    }
}
