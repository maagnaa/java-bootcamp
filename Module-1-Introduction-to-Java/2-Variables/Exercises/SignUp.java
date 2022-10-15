import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //1. Ask for their first name.
        System.out.println("Enter your first name:");
        String scanFirstName = scan.nextLine();
        //2. Ask for their last name.
        System.out.println("Enter your last name");
        String scanLastName = scan.nextLine();

        //3. Ask: how old are you?
        System.out.println("Enter your age:");

        int scanAge = scan.nextInt();
        scan.nextLine();

        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        System.out.println("Enter your desired username");
        String scanUsername = scan.nextLine();

        //4. Ask what city they live in.
        System.out.println("Enter the name of the city you live in:");
        String scanCity = scan.nextLine();
        //5. Ask what country that's from.
        System.out.println("Enter the name of the country you live in:");
        String scanCountry = scan.nextLine();
        //Task 2 - Print their information. 

        System.out.println("Your Information:");
        System.out.println("Name : "+scanFirstName+" "+scanLastName);
        System.out.println("Age : "+scanAge);
        System.out.println("Location : "+scanCity+", "+scanCountry);
        System.out.println("Username : "+scanUsername);


        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
        scan.close();

    }
}
