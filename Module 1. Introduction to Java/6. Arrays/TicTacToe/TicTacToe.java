import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

    static int noOfColumns  = 3;
    static int noOfRows     = 3;

    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char[][] board = {
                {'_','_','_'},    // Row 0
                {'_','_','_'},    // Row 1
                {'_','_','_'}     // Row 2
            };

            //Task 2: Call the function printBoard();
            printBoard(board);
             
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

            boolean xTurn = true;
            int[] spot = new int[2];
            
            for(int i=0;i<10;i++){  //Maximum is 9 turns
                System.out.print("\n"+i+".\t");
                if(xTurn){
                  System.out.print("Its X's turn\n");
                  spot = askUser(board);
                  board[spot[0]][spot[1]] = 'X';
                }else{
                  System.out.print("It's O's turn\n");
                  spot = askUser(board);
                  board[spot[0]][spot[1]] = 'O';
                }
                xTurn = !xTurn;
                printBoard(board);

                
                if (checkWin(board)=='X'){
                    System.out.println("X wins!!");
                    break;
                } else if (checkWin(board)=='O'){
                    System.out.println("O wins!!");
                    break;
                }

            }


            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character  (I changed to tab because I think the board looks better that way)
     */        

    public static void printBoard(char[][] array){
      System.out.print("\t0.\t1.\t2.\t");

      for(int i=0;i<noOfRows;i++){            // Loop through rows
   // for(int i=0;i<array.length;i++){            // Alternative way using array.length
  
          if(i<10){
              System.out.println("\n");
              System.out.print(i+".\t");

          
          for(int j=0;j<noOfColumns;j++){     // Loop through columns


              System.out.print(array[i][j]+"\t");
              if(j==(array[i].length)){
                  System.out.print("\n");
              }
          }
          System.out.print("\n");

      }
    }
  }


   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */

    public static int[] askUser(char[][] board){

      int row, column;
      boolean validSpotPicked = false;

      do{
        System.out.println("Pick a row number");
        row = scan.nextInt();
        scan.nextLine();
        System.out.println("Pick a columnn number");
        column = scan.nextInt();
        scan.nextLine();
  
        if(board[row][column] != ('_')){
          System.out.println("The spot you chose is taken. Try again:");
          validSpotPicked = false;
        }else{
          validSpotPicked = true;
        }

      }while(!validSpotPicked);
  

      int[] spot = {row, column};
      return spot;
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */

    public static int checkWin(char[][] board) {

        char hResult = 'N';
        char vResult = 'N';
        char dResult = 'N';


        char result = 'N';
 

        hResult = checkHorizontally(board);
        vResult = checkVertically(board);
        dResult = checkDiagonally(board);

        if(hResult!='N'){
            result = hResult;
        }else if(vResult!='N'){
            result = vResult;
        }else if(dResult!='N'){
            result = dResult;
        }

      
        return result;
  }


public static char checkHorizontally(char[][] board){
    int xCount = 0;
    int oCount = 0;

    char result = 'N';

    // Check Horizontally
    for (int i = 0; i < noOfRows; i++) {                // Loop through each row

        for (int j = 0; j < board[i].length; j++) {     // Loop through each item in the row
            
            if (board[i][j] == 'X') {
                xCount++; //count each X as +1
            } else if (board[i][j] == 'O') { 
                oCount++; //count each O as -1. 
            } 

            if(j==(noOfColumns-1)){                 // If this is the last item in the row
                if (xCount == 3) {                      // Check for win condition for X
                    result = 'X';
                } else if (oCount == 3){                // Check for win condition for 0
                    result = 'O';
                } else {                                // Reset counters if win condition is not
                    xCount = 0;                         // achieved after the last item of the row.
                    oCount = 0;
                }
            }
        }
    }
  return result;
}

public static char checkVertically(char[][] board){
    int xCount = 0;
    int oCount = 0;

    char result = 'N';

    // Check Horizontally
    for (int i=0; i<noOfColumns; i++) {                    // Loop through columns


        for (int j=0; j<noOfRows; j++) {                   // Looop through rows 
            
            if (board[j][i] == 'X') {                            // Care to index i as columns and j as rows
                xCount++; //count each X as +1
            } else if (board[j][i] == 'O') { 
                oCount++; //count each O as -1. 
            } 

            if(j==(noOfRows-1)){
                if (xCount == 3) {
                    result = 'X';
                } else if (oCount == 3){
                    result = 'O';
                } else {
                    xCount = 0;
                    oCount = 0;
                }
            }
        }
    }
  return result;
}

public static char checkDiagonally(char[][] board){

    int xCount=0;
    int oCount=0;

    char result = 'N';

    // Check Left to Right
    for(int i=0; i<noOfRows; i++){
        if(board[i][i]=='X'){
            xCount ++;
        }else if(board[i][i]=='O'){
            oCount ++;
        }
    }

    if (xCount == 3) {
        result = 'X';
    } else if (oCount == 3){
        result = 'O';
    } else {
        xCount = 0;
        oCount = 0;
    }

    // Check Left to Right
    for(int i=0; i<noOfRows; i++){
        if(board[i][(noOfRows-1)-i]=='X'){
            xCount ++;
        }else if(board[i][(noOfRows-1)-i]=='O'){
            oCount ++;
        }
    }
    
    if (xCount == 3) {
        result = 'X';
    } else if (oCount == 3){
        result = 'O';
    } else {
        xCount = 0;
        oCount = 0;
    }

    return result;
}

}


