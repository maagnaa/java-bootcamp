// public class HighScore {
//     public static void main(String[] args) {
//         int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
//             randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
//         System.out.print("Here are the scores: ");
//         for (int i = 0; i < scores.length; i++) {
//             System.out.print(scores[i] + " ");
//         }
    
//         int highScore = 0;
//         for (int i = 0; i < scores.length; i++) {
//             if (scores[i] > highScore) {
//                 highScore = scores[i];
//             }
//         }
//         /** Task 1 – Find the person with the highest score
//          *  
//          *   • After obtaining the highest score, print: The highest score is:  <highScore>. Impressive!
//          *   • It's the gentleman in seat: <index>. Give that man a cookie!
//          *  
//          */
//     }
    
//     public static int randomNumber() {
//         double randomDouble = Math.random() * 50000;
//         int randomInt = (int)randomDouble;
//         return randomInt;
//     }
// }

import java.util.concurrent.ThreadLocalRandom;

public class HighScore {
    public static void main(String[] args) {

        int[] randomNumbers = new int[10];

        int highScore = 0;
        int highScoreIndex = 0;

        System.out.print("Here are the scores:  ");
        for(int i=0; i<randomNumbers.length;i++){
            randomNumbers[i] = randomNumber();

            System.out.print("S"+(i+1)+". "+randomNumbers[i]+" ");

            if (i ==0){
                highScore = randomNumbers[i];
            } else {
                if (randomNumbers[i]>highScore){
                    highScore = randomNumbers[i];
                    highScoreIndex = i;
                }

                if(i==(randomNumbers.length-1)){
                    System.out.print("\n");
                }
            }

            try{Thread.sleep(200);} catch(InterruptedException e){System.out.println(e);}
        }


          System.out.println("The highest score is: "+highScore+". Impressive!");
          System.out.println("Its the gentleman in seat: "+(highScoreIndex+1)+". Give that man a cookie!");


    }


    
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */

     public static int randomNumber(){
        return ThreadLocalRandom.current().nextInt(0,50001);
     }
    

}
