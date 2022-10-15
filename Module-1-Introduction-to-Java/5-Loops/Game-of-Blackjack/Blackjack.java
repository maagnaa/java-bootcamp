import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int[] userCards = new int[2];
        userCards[0] = drawRandomCard();
        userCards[1] = drawRandomCard();
        int userHandValue = calculateHandValue(userCards);

        System.out.println("Your hand is: \n");
        printHand(userCards, "user");


        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        System.out.println("Your total hand value is:"+userHandValue);
        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hiddenarray.inser
        int[] dealerCards = new int[2];
        dealerCards[0] = drawRandomCard();
        dealerCards[1] = drawRandomCard();
        int dealerHandValue = calculateHandValue(dealerCards);


        System.out.println("The dealers hand is: \n");
        printHand(dealerCards, "dealer");
        System.out.println("The dealers hand value is hidden.");


        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>
        //       2. Once the player stays, break the loop. 
        
    
        System.out.println("Its your turn...");

        boolean userHit = true;
        userHit = promptHitOrStay();

    
        while(userHit){

            int userHandLen = userCards.length;
            userCards = Arrays.copyOf(userCards,userHandLen+1);

            userCards[userHandLen] = drawRandomCard();

            System.out.println("Your hand is now:");
            printHand(userCards, "user");
            userHandValue = calculateHandValue(userCards);
            System.out.println("Your total hand value is:"+userHandValue);

            if(userHandValue>=21){
                System.out.println("BUST! Player looses!");
                System.exit(0);
            }

            userHit = promptHitOrStay();
        }

       System.out.println("Its the dealers turn...");


       boolean dealerHit = false;
       if (dealerHandValue < 17){
            dealerHit = true;
       }else{
            System.out.println("The dealer stays.");
       }

       while(dealerHit){
            System.out.println("The dealer hits!");
            int dealerHandLen = dealerCards.length;
            dealerCards = Arrays.copyOf(dealerCards,dealerHandLen+1);
            dealerCards[dealerHandLen] = drawRandomCard();
            System.out.println("The dealers hand is now:");
            printHand(dealerCards, "dealer");
            dealerHandValue = calculateHandValue(dealerCards);
            if(dealerHandValue>=21){
                System.out.println("BUST! Dealer looses!");
                System.exit(0);
            }else if(dealerHandValue==17){
                dealerHit = false;
            }
       }

       // Results
       System.out.println("Your final hand value is:"+userHandValue);
       System.out.println("The dealers final hand value is:"+dealerHandValue);

       if(dealerHandValue == userHandValue){
            System.out.println("Its a TIE!");
       }else if(dealerHandValue > userHandValue){
            System.out.println("The dealer wins!");
       }else{
            System.out.println("You win!");
       }
        
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard(){
        // Generate a random number between 1 and 13
        return ThreadLocalRandom.current().nextInt(1,(13+1));
     }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – getCard
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */    
    
    public static int calculateHandValue(int[] hand){
        int handValue=0;
        for(int i=0; i<hand.length;i++){
            if(hand[i]>11){
                handValue += 10;
            }else{
                handValue += hand[i];
            }
        }
        return handValue;

    }

    public static void printHand(int[] hand, String userOrDealer){

        if(userOrDealer.equals("user")){
            for(int i=0; i<hand.length;i++){
                System.out.println(getCard(hand[i]));
            }
        }else if(userOrDealer.equals("dealer")){
            for(int i=0; i<(hand.length)-1;i++){
                System.out.println(getCard(hand[i]));
            }
            System.out.println(faceDown());
        }
    }
     
     public static String getCard(int cardNumber){
        String card = " ";

        switch(cardNumber){
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

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */


    // Modifying to return boolean instead. True to continue the game and false to end it. 

    public static boolean promptHitOrStay(){
        boolean validResponse = false;
        boolean hit = true;
        String response = "";

        System.out.println("Do you want to hit or stay?");

        while(!validResponse){
            response = scan.nextLine();

            if(response.equalsIgnoreCase("hit")){
                hit = true;
                validResponse = true;
            }else if(response.equalsIgnoreCase("stay")){
                hit = false;
                validResponse = true;
            }else{
                System.out.println("Your answer is not valid. Valid answers are: 'hit' or 'stay'.");
            }
        }

        return hit;
    }

}

