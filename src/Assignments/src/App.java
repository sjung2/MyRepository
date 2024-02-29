import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix A:");
        int rowsA = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int colsA = scanner.nextInt();
        int[][] matrixA = inputMatrix(scanner, "A", rowsA, colsA);

        System.out.println("Enter the number of rows for matrix B:");
        int rowsB = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int colsB = scanner.nextInt();
        int[][] matrixB = inputMatrix(scanner, "B", rowsB, colsB);

        if (colsA != rowsB) {
            System.out.println("Error");
            return;
        }


    }

    private static int[][] inputMatrix(Scanner scanner, String matrixName, int rows, int cols) {
        System.out.println("Enter elements for matrix " + matrixName + ":");
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
