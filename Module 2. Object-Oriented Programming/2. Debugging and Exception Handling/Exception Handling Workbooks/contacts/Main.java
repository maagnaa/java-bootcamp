import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    // Make contactManager into a class variable
    static ContactManager contactManager = new ContactManager();

    public static void main(String[] args) {
        try{
           
            loadContacts("contacts.txt");
            System.out.println("CONTACTS LOADED\n\n");

            System.out.print("\n\n");
            System.out.println(contactManager.toString());

            manageContacts();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */

    public static void manageContacts(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();
            if(response.equals("a")){
                // User wishes to add a contact
               
                //Name
                System.out.println("Enter the name of your contact:");
                String name = scan.nextLine();
                //Phone Number
                System.out.println("Enter the phone number of your contact:");
                String phoneNumber = scan.nextLine();
                //Birthdate
                System.out.println("Enter the birthdate (MM/DD/YYYY) of your contact:");
                String birthDate = scan.nextLine();
                if (name.isBlank() || phoneNumber.isBlank() || phoneNumber.length() < 5) {
                    System.out.println("\nThe input you provided is not valid. Registration failed.");
                } else {
                    try {
                        contactManager.addContact(new Contact(name, phoneNumber, birthDate));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } finally { //contacts will re-print regardless of the outcome...
                        System.out.println("\n\nUPDATED CONTACTS\n\n" + contactManager);
                    }
                }
            }else if(response.equals("b")){
                //User wishes to remove a contact
                System.out.println("\nWho would you like to remove?");
                contactManager.removeContact(scan.nextLine());
                System.out.println("\n\nUPDATED CONTACTS\n\n" + contactManager);
            }else if(response.equals("c")){
                // User wishes to exit
                break;
            }else{
                System.out.println("You did not input a valid option.\n");
            }



        }
        scan.close();
    }



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

     public static void loadContacts(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanFile = new Scanner(fis);

        while(scanFile.hasNextLine()){
            try{
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
                contactManager.addContact(contact);
            }catch(ParseException e){
                System.out.println(e.getMessage());
            }
        }

     }
}
