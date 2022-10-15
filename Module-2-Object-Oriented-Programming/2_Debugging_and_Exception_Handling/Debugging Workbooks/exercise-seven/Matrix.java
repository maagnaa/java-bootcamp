/*
    Using a nested loop, the goal is to convert a matrix (2D array) of zeros:

    >>: [0, 0, 0]

    >>: [0, 0, 0]

    >>: [0, 0, 0]

    to the following:

    >>: [0, 1, 2]

    >>: [0, 1, 2]

    >>: [0, 1, 2]

    However, the current code crashes.

    Use breakpoints to visualize the runtime. Watching the output line by line will help you debug the problem.
 */


import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { //matrix means 2d array
             {0, 0, 0},
             {0, 0, 0},
             {0, 0, 0}
        };

        for (int i = 0; i < matrix.length; i++) {
            int rowLength = matrix[i].length;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
