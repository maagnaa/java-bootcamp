import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();

        System.out.println( "It's like Poker, but a lot simpler.\n"+
                            "• There are two players, you and the computer.\n"+
                            "• The dealer will give each player one card.\n"+
                            "• Then, the dealer will draw five cards (the river)\n"+
                            "• The player with the most river matches wins!\n"+
                            "• If the matches are equal, everyone's a winner!\n\n"+
                            " • Ready? Type anything if you are.");
        scan.nextLine();

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */

        String userCard, computerCard;
        userCard = randomCard();
        System.out.println("Here's your card:\n"+userCard);
        computerCard = randomCard();
        System.out.println("Here's the computer's card:\n"+computerCard);
        
        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

         System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
         scan.nextLine();
         System.out.println("The dealer will draw a card every time the user presses enter.");

        String[] dealtCards = new String[5]; 

        int userPoints = 0;
        int computerPoints = 0;

         for(int i=1;i<6;i++){
            scan.nextLine();

            dealtCards[i] = randomCard();
            System.out.println("Card "+ i + "\n" + dealtCards[i]); 

            if(userCard.equals(dealtCards[i])){
                userPoints ++;
            }

            if(computerCard.equals(dealtCards[i])){
                computerPoints ++;
            }
         }

         System.out.println("RESULTS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n\n "+
                            "Your number of matches:"+userPoints+"\n"+
                            "The computer's number of matches:"+computerPoints+"\n");
        
        if(userPoints == computerPoints){
            System.out.println("Its a TIE! Everyone wins!");
        }else if(userPoints>computerPoints){
            System.out.println("You WIN! Congratulations.");
        }else if(userPoints<computerPoints){
            System.out.println("The computer wins! You LOSE. Better luck next time.");
        }else{
            System.out.println("Error: Cannot compute results. The computer is drunk!");
        }



        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard(){
        String card = " ";

        // Generate a random number between 1 and 13
        int cardID = ThreadLocalRandom.current().nextInt(1,(13+1));

        switch(cardID){
            case 1:
                card =  "   _____ \n"+
                        "  |A _  |\n"+ 
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            break;
            case 2:
                card =  "   _____ \n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
            break;
            case 3:
                card =  "   _____ \n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";
            break;
            case 4:
                card =  "   _____ \n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n";
            break;
            case 5:
                card =  "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            break;
            case 6:
                card =  "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            break;
            case 7:
                card =  "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            break;
            case 8:
                card =  "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            break;
            case 9:
                card =  "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            break;
            case 10:
                card =  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            break;
            case 11:
                card =  "   _____ \n" +
                        "  |J  ww|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o% |\n"+ 
                        "  | | % |\n"+ 
                        "  |__%%[|\n";
            break;
            case 12:
                card =  "   _____\n" +
                        "  |Q  ww|\n"+ 
                        "  | o {(|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%O|\n";
            break;
            case 13:
                card =  "   _____\n" +
                        "  |K  WW|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%>|\n";
            break;
            default:
                System.out.println("ERROR: Failed to generate a random card. Computer is drunk!");
        }

        return card;
    }
}
