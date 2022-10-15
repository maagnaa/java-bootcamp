import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String userWantsMortgage = scan.nextLine();

        //Task 2 - Print this if the decision is "yes"
        if (userWantsMortgage.equals("yes")){
            
            System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
            
            int userSavings = scan.nextInt();
            int userDebt = scan.nextInt();
            System.out.println("\nHow many years have you worked for?");
            int userWorkYears = scan.nextInt();
            scan.nextLine();

            System.out.println("What is your name?");
            String userName = scan.nextLine();

               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.          
            if ((userSavings >= 10000) && (userDebt <= 5000) && (userWorkYears >= 2)){
                System.out.println("Congratulations "+ userName +" You have been approved!");
 
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }        
        } else if (userWantsMortgage.equals("no")){
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}