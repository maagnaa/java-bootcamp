public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // Constructor Method
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    // Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }


    // Getter Methods
    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }

    // Print Person Data

    public void printPersonData(){
        System.out.println( "Name: "            + this.name         + "\n" + 
                            "Nationality: "     + this.nationality  + "\n" + 
                            "Date of Birth: "   + this.dateOfBirth  + "\n" + 
                            "Seat Number: "     + this.seatNumber   + "\n");
    }
}
