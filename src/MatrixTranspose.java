import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter the no. of column : ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        findMatrixTranspose(matrix);
    }

    private static void findMatrixTranspose(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        int[][] outputMatrix = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                    outputMatrix[i][j] = matrix[j][i];
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
