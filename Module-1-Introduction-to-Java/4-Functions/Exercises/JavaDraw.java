import java.util.Scanner;

public class JavaDraw {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        for(int i=0; i<5;i++){        
                getAndExcecutePrintRequest();
        }
        scan.close();        
    }


       //Task 2 – Write a function 

    /**
     * Function name: draw - draws an animal that the user chooses.
     * @param choice: (int)
     * 
     * Inside the function: 
     *  • Based on the choice, draw:
     *      1. a butterfly
     *      2. elephant
     *      3. bear
     *      4. snake//(())
     */  

    public static void getAndExcecutePrintRequest(){
        int choice, selection;

        System.out.print( "\nWhich animal would you like to draw?\n" );
        System.out.println( "Write 1 for butterfly " );
        System.out.println( "Write 2 for elephant  " );
        System.out.println( "Write 3 for bear      " );
        System.out.println( "Write 4 for snake     " );

        //Task 1 – Pick up the user's choice.
        selection = scan.nextInt();

        //Task 3 – Call the draw function, and pass in the user's choice.
        printAnimal(selection);
    }


    public static void printAnimal(int selection){
        switch (selection){
                case 1:
                        printButterfly();
                        break;
                case 2:
                        printElephant();
                        break;
                case 3:
                        printBear();
                        break;
                case 4: printSnake();
                        break;
                default:
                        System.out.println("ERROR: " + selection + " is not a valid choice.");
                
        }
    }


    public static void printButterfly(){
            System.out.println("  .==-.                   .-==.     ");
            System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
            System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
            System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
            System.out.println("      `._... .q(_)p. ..._.'         ");
            System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
            System.out.println("        .\"\"' .'|=|`. `\"\".       ");
            System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
            System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
            System.out.println("      \\O `::/       \\::' O/       ");
            System.out.println("       \"\"--'         `--\"\"      ");
        }
        public static void printElephant(){
            System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
            System.out.println("   _.-'         \\ __...----...__ /         '-._");
            System.out.println(" .'      .:::...,'              ',...:::.      '.");
            System.out.println("(     .'``'''::;                  ;::'''``'.     )");
            System.out.println(" \\             '-)              (-'             /");
            System.out.println("  \\             /                \\             /");
            System.out.println("   \\          .'.-.            .-.'.          /");
            System.out.println("    \\         | \\0|            |0/ |         /");
            System.out.println("    |          \\  |   .-==-.   |  /          |");
            System.out.println("     \\          `/`;          ;`\\`          /");
            System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
            System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
            System.out.println("               / /`;   .==.   ;`\\ \\");
            System.out.println("         .---./_/   \\  .==.  /   \\ \\");
            System.out.println("        / '.    `-.__)       |    `\"");
            System.out.println("       | =(`-.        '==.   ;");
            System.out.println("        \\  '. `-.           /");
            System.out.println("         \\_:_)   `\"--.....-'");
        }
        public static void printBear(){
            System.out.println("            ___   .--. ");
            System.out.println("      .--.-\"   \"-' .- |");
            System.out.println("     / .-,`          .'");
            System.out.println("     \\   `           \\");
            System.out.println("      '.            ! \\");
            System.out.println("        |     !  .--.  |");
            System.out.println("        \\        '--'  /.____");
            System.out.println("       /`-.     \\__,'.'      `\\");
            System.out.println("    __/   \\`-.____.-' `\\      /");
            System.out.println("    | `---`'-'._/-`     \\----'    _");
            System.out.println("    |,-'`  /             |    _.-' `\\");
            System.out.println("   .'     /              |--'`     / |");
            System.out.println("  /      /\\              `         | |");
            System.out.println("  |   .\\/  \\      .--. __          \\ |");
            System.out.println("   '-'      '._       /  `\\         /");
            System.out.println("               `\\    '     |------'`");
            System.out.println("                 \\  |      |");
            System.out.println("                  \\        /");
            System.out.println("                   '._  _.'");
            System.out.println("                      ``");
        }
        public static void printSnake(){
            System.out.println("         ,,'6''-,.");
            System.out.println("        <====,.;;--.");
            System.out.println("        _`---===. \"\"\"==__");
            System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
            System.out.println("     |( @@@  |===|  @@@  ||");
            System.out.println("      \\\\ @@   |===|  @@  //");
            System.out.println("        \\\\ @@ |===|@@@ //");
            System.out.println("         \\\\  |===|  //");
            System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
            System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
            System.out.println("             |==||                           `\\   \\");
            System.out.println("            |==| |                             )   |");
            System.out.println("           |==| |       _____         ______,--'   '");
            System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
            System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
            System.out.println("                \"\"\"\"		");
        }
     


}
