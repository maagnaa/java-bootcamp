import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    // Copy Constructor Method
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
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
    public void setPassport(){
        this.passport = new String[]{this.name, this.nationality, this.dateOfBirth};
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
    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
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

        //System.out.println("DBG @ applyForPassport - a:"+a);
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
        this.seatNumber = ThreadLocalRandom.current().nextInt(1,12);
    }

    /** 
     * Function name: printPersonData
     */
    public String toString(){
        return  (   "Name: "            + this.name                         + "\n" + 
                    "Nationality: "     + this.nationality                  + "\n" + 
                    "Date of Birth: "   + this.dateOfBirth                  + "\n" + 
                    "Seat Number: "     + this.seatNumber                   + "\n" +
                    "Passport: "        + Arrays.toString(this.passport)    + "\n");
    }
}
