import java.util.concurrent.ThreadLocalRandom;


public class Doubles {
    public static void main(String[] args) {

        /* Task 2
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.   

        */
        int dice1;
        int dice2;

        boolean rolledDoubles = false;

        /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values. 
         */

        while (!rolledDoubles){
            dice1 =rollDice();
            dice2 =rollDice();
    
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");

            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}

            if(dice1==dice2){
                System.out.println("You rolled doubles!");
                rolledDoubles = true;
            }
        }

        // Task 4: After they roll doubles, print: You rolled doubles!
    }


    /** Task 1 
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */

     public static int rollDice(){
        return ThreadLocalRandom.current().nextInt(1,6);
     }

}





