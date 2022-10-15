/*
 A lower triangular matrix is a 2D array with zeros above the main diagonal.

    3    0  0   0
    2   -1  0   0
    1   -2  2   0
    1    3  4   2

    The goal is to convert a 2D array into a lower triangular matrix:

    >>: [1, 0, 0]

    >>: [8, 6, 0]

    >>: [2, 4, 6]

    However, the code produces:

    >>: [0, 2, 3]

    >>: [8, 0, 4]

    >>: [2, 4, 0]

    Use breakpoints to visualize the runtime. Watching the output line by line will help you debug the problem.

 */

import java.util.Arrays;

public class LowerTriangular {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {8, 6, 4},
            {2, 4, 6}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j >= i) {
                    matrix[i][j] = 0;
                }
            } 
        }

        System.out.println();
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
