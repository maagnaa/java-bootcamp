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
