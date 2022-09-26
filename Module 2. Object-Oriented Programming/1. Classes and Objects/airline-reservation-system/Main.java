import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Magna Nordgard","Norwegian","23/09/1992",5);

        //Use the getter methods instead of person.printPersonData() this time
        System.out.println( "Name: "            + person.getName()         + "\n" + 
                            "Nationality: "     + person.getNationality()  + "\n" + 
                            "Date of Birth: "   + person.getDateOfBirth()  + "\n" + 
                            "Seat Number: "     + person.getSeatNumber()   + "\n");

        // Use a setter method
        person.setSeatNumber(10);

        person.printPersonData();
    }
  
  
}
