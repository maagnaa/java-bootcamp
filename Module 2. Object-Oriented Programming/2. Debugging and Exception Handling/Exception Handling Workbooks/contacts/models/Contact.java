package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
  
    // Task 1. Add the necessary fields to the Contact class. Protect each field using the private keyword.
    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    /*  Task 2. The constructor will only receive three parameters: name, phoneNumber and birthDate.
    The birthDate that gets passed will automatically determine the age.
    Hints:
    - Research how to create an object of the SimpleDateFormat class.
    - Use the SimpleDateFormat object to parse() a Date from the birthDate String.
    - Assume the birthDate follows the MM/dd/yyyy format.
    */
    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Contact name cannot be null/blank.");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Contact phoneNumber cannot be null/blank.");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Contact phoneNumber can't be less than 5 characters.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }
  
    public int calculateAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime(); //age in milliseconds
        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    public String toString() {
        return ("Name: "             + this.name            + "\n" +
                "Phone number: "    + this.phoneNumber      + "\n" +
                "Birth Date: "      + this.birthDate        + "\n" +
                "Age: "             + this.age + " years old.  \n");
    }


}
