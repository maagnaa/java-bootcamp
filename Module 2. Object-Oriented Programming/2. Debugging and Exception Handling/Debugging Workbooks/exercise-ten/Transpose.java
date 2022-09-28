/*
 The transpose of a matrix reverses the columns and rows. In other words, each row from the original matrix becomes a column in the new matrix.



Your code starts with the following matrix:

>>: [1, 2, 3]

>>: [4, 5, 6]

>>: [7, 8, 9]

The goal is to transpose it:

>>: [1, 4, 7]

>>: [2, 5, 8]

>>: [3, 6, 9]

But, your code produces:

>>: [1, 4, 7]

>>: [4, 5, 8]

>>: [7, 8, 9]

Use breakpoints to visualize the runtime. Watching the output line by line will help you debug the problem.

 */




import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
