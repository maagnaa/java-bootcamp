package models;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager(){
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index){
        return contacts.get(index);
    }

    public void setContact(int index, Contact contact){
        this.contacts.set(index, contact);
    }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public String toString(){
        String returnString = "";
        for(int i=0; i<contacts.size(); i++){
            returnString += contacts.get(i).toString()+"\n\n";

        }
        return (returnString);
    }
}
