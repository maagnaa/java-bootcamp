import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int[][] numArray = new int[100][10];

        /** Task 4
         * 
         * 1. Using a nested loop, populate the array with random numbers. 
         * 2. Then, pass the updated array into print2DArray.  
         * 
         */

        for(int i=0;i<numArray.length;i++){            // Loop through rows
            for(int j=0;j<numArray[i].length;j++){     // Loop through columns
                numArray[i][j] = randomNumber();
            }
        }

        print2DArray(numArray);
        
    }

    /** Task 1
     * Function name: randomNumber.
     * 
     * @return randomNumber (int)
     * 
     * Inside the function:
     *    1. return a random number between 1 and 100. 
     */

    public static int randomNumber(){
        return ThreadLocalRandom.current().nextInt(1,101);
    }


    /** Task 2
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */

     public static void print2DArray(int[][] array){
        for(int i=0;i<array.length;i++){            // Loop through rows
            if(i<10){
                System.out.print("ROW  "+i+".  ");

            }else{
                System.out.print("ROW "+i+".  ");
            }
            
            for(int j=0;j<array[i].length;j++){     // Loop through columns
                System.out.print("\t"+array[i][j]+" ");
                if(j==(array[i].length)){
                    System.out.print("\n");
                }
            }
            System.out.print("\n");

        }
     }

}
