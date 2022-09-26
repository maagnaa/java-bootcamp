import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Magna Nordgard", "Norwegian", "23/09/1992", 1);

        if (person.applyForPassport() == true) {
            person.setPassport();
        }

        System.out.println( "Name: "            + person.getName()          + "\n" + 
                            "Nationality: "     + person.getNationality()   + "\n" + 
                            "Date of Birth: "   + person.getDateOfBirth()   + "\n" +
                            "Seat Number: "     + person.getSeatNumber()    + "\n" + 
                            "Passport: "        + Arrays.toString(person.getPassport()) + "\n");
    }
  
  
}
