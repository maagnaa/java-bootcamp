public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    // Constructor Method
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    // Print Person Data

    public void printPersonData(){
        System.out.println( "Name: "            + this.name         + "\n" + 
                            "Nationality: "     + this.nationality  + "\n" + 
                            "Date of Birth: "   + this.dateOfBirth  + "\n" + 
                            "Seat Number: "     + this.seatNumber   + "\n");
    }
}
