import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RockPaperScissors {

    static boolean debug = true;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String userResponse = scan.nextLine();

    /*Task 2: Set up the game
       • if the answer is yes: 
             – print: Great!
             – print: rock – paper – scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */

        if (userResponse.equalsIgnoreCase("yes")){

            System.out.println("Great!\n rock, paper, scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = genComputerChoice();
            String result = getMatchResult(userChoice, computerChoice);
            System.out.println( "You chose: "+ userChoice + 
                                "\n The computer chose: "+ computerChoice+
                                "\n Result: "+result); 
        else{
            System.out.println("Darn, some other time...!");
        }
              

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

     public static String genComputerChoice(){
        int computerChoiceInt = ThreadLocalRandom.current().nextInt(0,2);

        if (debug){
            System.out.println("computerChoiceInt: "+computerChoiceInt);
        }
        String computerChoiceString;

        switch (computerChoiceInt){
            case 0:
                computerChoiceString = "rock";
                break;
            case 1:
                computerChoiceString = "paper";
                break;
            case 2:
                computerChoiceString = "scissors";
                break;
            default:
                computerChoiceString = "ERROR! Computer is drunk.";
        }

        return computerChoiceString;
     }




    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */

    public static String getMatchResult(String userChoice, String computerChoice) {
        String result = "";

        boolean winCondition =  (userChoice.equalsIgnoreCase("rock")&&computerChoice.equalsIgnoreCase("scissors"))
                                || (userChoice.equalsIgnoreCase("paper")&&computerChoice.equalsIgnoreCase("rock"))
                                || (userChoice.equalsIgnoreCase("scissors")&&computerChoice.equalsIgnoreCase("paper"));

        boolean loseCondition =  (userChoice.equalsIgnoreCase("scissors")&&computerChoice.equalsIgnoreCase("rock"))
                                || (userChoice.equalsIgnoreCase("rock")&&computerChoice.equalsIgnoreCase("paper"))
                                || (userChoice.equalsIgnoreCase("paper")&&computerChoice.equalsIgnoreCase("scissors"));

        boolean tieCondition = userChoice.equalsIgnoreCase(computerChoice);

        if (debug){
            System.out.println("winCondition: "+ winCondition +" - loseCondition: "+ loseCondition +" - tie: "+tieCondition);
        }

        if(winCondition){
            result = "You WIN!";
        } else if(loseCondition){
            result = "You LOOSE!";
        } else if(tieCondition) {
            result = "Its a TIE!";
        } else {
            result = "ERROR: Cannot compute result. Computer is drunk!";
        }

        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
