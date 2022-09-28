/*
The code was supposed to produce the following output:

>>: X _ O

>>: _ O _

>>: O _ X

O WINS!

Instead, the code produces:

>>: X _ O

>>: _ X _

>>: O _ X

O WINS!

Use breakpoints to visualize the runtime. Watching the output line by line will help you debug the problem.
 */


public class TicTacToe {
    public static void main(String[] args) {
        char[][] array = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 'X';
            array[i][2-i] = 'O';  
        }

        printArray(array);
        System.out.println("\nO WINS!\n");
   }
   
   public static void printArray(char[][] array) {
       System.out.println();
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.print( array[i][j] + "  ");
           }
           System.out.println();
       }
   }
}
