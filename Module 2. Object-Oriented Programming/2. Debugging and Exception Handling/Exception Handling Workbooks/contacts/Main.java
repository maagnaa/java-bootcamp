import java.text.ParseException;

import models.Contact;
import models.ContactManager;

public class Main {
    public static void main(String[] args) {
        try{
            Contact magna = new Contact("Magna Nordgard", "22225646", "09/23/1992");
            Contact martin = new Contact("Martin Eskerud", "22330506", "12/30/1991");

            ContactManager contactManager = new ContactManager();
            
            contactManager.addContact(magna);
            contactManager.addContact(martin);

            System.out.print("\n\n");
            System.out.println(contactManager.toString());

        }catch(ParseException e){
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

}
