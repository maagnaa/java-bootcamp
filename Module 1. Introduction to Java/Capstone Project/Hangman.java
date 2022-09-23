import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Hangman {

    public static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        int maxMisses = gallows.length;
        int misses = 0;
        int guesses = 0;
        startMessage();

        //printGallows(0);

        //System.out.println("Lets pick an index:");
        int index = pickRandomIndex();

        System.out.println("Picked index "+index+". The word is: "+words[index]);
        //System.out.println("Lets create placeholder array:");
        int wordLength = words[index].length();
        char[] placeHolderArray = createPlaceholderArray(wordLength);

        //System.out.println("The placeholder array is ");

        do{
            printPlaceholderArray(placeHolderArray);
            System.out.println("Guess a letter:");
            char guess = scan.next().charAt(0);
            int guessMatches = 0;

            for(int i=0;i<wordLength;i++){
                if(words[index].charAt(i)==guess){
                    placeHolderArray[i] = guess;
                    guessMatches++;
                };
            };
            if(guessMatches==0){
                System.out.println("That letter is not in this word.");
                misses++;
                printGallows(misses-1);
            }
            guesses += guessMatches;
            printPlaceholderArray(placeHolderArray);
            System.out.println("misses:"+misses+"\tguesses:"+guesses);
        }while((misses<maxMisses)&&(guesses!=wordLength));

        if(guesses==wordLength){
            System.out.println("You WON! Congratulations. :)");
        }else{
            System.out.println("You LOST! \nThe word was: "+words[index]);
        }
    }


    /** Function name - startMessage
     * 
     * A function to show the start message and wait for user to indicate readiness
     */
    public static void startMessage(){
        System.out.println("Welcome to Hangman!");
        System.out.println("Press Enter when you are ready to begin.");
        scan.nextLine();
    }

    
    /** Function name - printGallows 
    * @param misses (int)
    *
    * Print the gallows corresponding to the nr of misses indicated by the paramenter misses.
    * To declutter code a bit.
    */ 
    public static void printGallows(int misses){
        System.out.print(gallows[misses]);
}

    /** Function name - pickRandomIndex
    *
    * Generate a random number between 0 and words.length-1 to pick a random word from the array
    */ 
    public static int pickRandomIndex(){
        return ThreadLocalRandom.current().nextInt(0,words.length);
    }

    public static char[] createPlaceholderArray(int arrayLength){
        char[] placeHolderArray = new char[arrayLength];

        for(int i=0;i<arrayLength;i++){
            placeHolderArray[i] = '_';
        }

        return placeHolderArray;
    }

    public static void printPlaceholderArray(char[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }

}





