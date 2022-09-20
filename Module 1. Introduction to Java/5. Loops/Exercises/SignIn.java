import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Samantha";
        String password = "Java <3";

        boolean loginIsCorrect = false;
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        System.out.println("\nWelcome to Javagram! Sign in below\n");


        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */

       while (!loginIsCorrect){
        System.out.print("• Username: ");
        String usernameInput = scan.nextLine();

        System.out.print("• Password: ");
        String passwordInput = scan.nextLine();

        if (usernameInput.equals(username) && passwordInput.equals(password)){
            loginIsCorrect = true;
        } else {
            System.out.println("Incorrect, please try again!");
        }

       }

        scan.close();

    }
}
