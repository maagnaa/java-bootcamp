import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean guessIsTrue = false;

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
        int secretNumber = ThreadLocalRandom.current().nextInt(1,5);

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
        while (guessIsTrue == false) {
            int userGuess = scan.nextInt();
            if (userGuess == secretNumber){
                System.out.println("You guessed correctly!");
                guessIsTrue = true;
            } else {
                System.out.print("That is not the number I picked. Try again: ");
            }
        }

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
        scan.close();
    }

}
