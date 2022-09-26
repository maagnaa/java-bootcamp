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
        // person1.setSeatNumber(10);

        // Use chooseSeat() instead
        person1.chooseSeat();
        person1.printPersonData();

        // Use the copy constructor to create a copy of person 1
        Person person2 = new Person(person1);

        // Use setter methods to edit the fields of person 2
        person2.setName("Martin Eskerud");
        person2.setDateOfBirth("30/12/1991");
        person2.chooseSeat();

        person2.printPersonData();

        // Test applyForPassport
        if(person1.applyForPassport()==true){
            System.out.println("Congratulations "+person1.getName()+", your passport was approved!");
        }else{
            System.out.println("We're sorry "+person1.getName()+", we cannot process your application.");
        }

    }
  
  
}
