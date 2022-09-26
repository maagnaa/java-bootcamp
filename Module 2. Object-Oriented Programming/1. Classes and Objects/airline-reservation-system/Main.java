import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        // Use the constructor
        Person person1 = new Person("Magna Nordgard","Norwegian","23/09/1992",5);
        

        //Use the getter methods instead of person.printPersonData() this time
        System.out.println( "Name: "            + person1.getName()         + "\n" + 
                            "Nationality: "     + person1.getNationality()  + "\n" + 
                            "Date of Birth: "   + person1.getDateOfBirth()  + "\n" + 
                            "Seat Number: "     + person1.getSeatNumber()   + "\n");

        // Use a setter method
        person1.setSeatNumber(10);
        person1.printPersonData();

        // Use the copy constructor to create a copy of person 1
        Person person2 = new Person(person1);

        // Use setter methods to edit the fields of person 2
        person2.setName("Martin Eskerud");
        person2.setDateOfBirth("30/12/1991");
        person2.setSeatNumber(11);

        person2.printPersonData();

    }
  
  
}
