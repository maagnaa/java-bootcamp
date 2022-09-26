import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

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

    // Copy Constructor Method
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
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

    // Actions

    /** 
     * Function name :  applyForPassport
     * @return (boolean)
     * 
     * Returns a random boolean of true or false.
     */
    public boolean applyForPassport(){
        int a = ThreadLocalRandom.current().nextInt(0,2);

        if(a==0){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Function name : chooseSeat
     * @ return (int)
     * 
     *  Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat(){
        this.seatNumber = ThreadLocalRandom.current().nextInt(0,12);
    }

    /** 
     * Function name: printPersonData
     */
    public void printPersonData(){
        System.out.println( "Name: "            + this.name         + "\n" + 
                            "Nationality: "     + this.nationality  + "\n" + 
                            "Date of Birth: "   + this.dateOfBirth  + "\n" + 
                            "Seat Number: "     + this.seatNumber   + "\n");
    }
}
