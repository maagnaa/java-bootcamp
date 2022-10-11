package src.main.models;

import java.util.Arrays;
import java.util.Objects;


public class Team {
    // Fields
    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;
    // Static Variables
    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";
    
    // Constructor
    public Team(String house, String keeper, String seeker, String[] chasers){
        // Check validity of string parameters
        checkStringParamValidity(house);
        checkStringParamValidity(keeper);
        checkStringParamValidity(seeker);
        // Check validity of chasers parameter 
        checkChaserParamValidity(chasers);

        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    // Copy Constructor
    public Team(Team source){
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers, source.chasers.length);
    }

    // Field Getters
    public String getHouse(){
        return house;
    }
    public String getKeeper(){
        return keeper;
    }
    public String getSeeker(){
        return seeker;
    }
    public String[] getChasers(){
        return Arrays.copyOf(chasers, chasers.length);
    }
    // Field Setters
    public void setHouse(String house){
        checkStringParamValidity(house);
        this.house = house;
    }
    public void setKeeper(String keeper){
        checkStringParamValidity(keeper);
        this.keeper = keeper;
    }
    public void setSeeker(String seeker){
        checkStringParamValidity(seeker);
        this.seeker = seeker;
    }
    public void setChasers(String[] chasers){
        checkChaserParamValidity(chasers);
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    // Getters for Static Variables
     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

     // hasNull
     public static boolean hasNull(String[] array){
        return Arrays.stream(array).anyMatch(element -> element == null);
     }
     // hasBlank
     public static boolean hasBlank(String[] array){
        return Arrays.stream(array).anyMatch(element -> element.isBlank());
     }
     // checkStringParamValidity
     public static void checkStringParamValidity(String param){
        if(param == null || param.isBlank()){
            throw new IllegalArgumentException("Parameter cannot be null or blank.");
        }
     }
     // checkChaserParamValidity
     public static void checkChaserParamValidity(String[] param){
        // Check for illegal length of chasers array
        if(param.length != 3){
            throw new IllegalArgumentException("Chasers array length is not the required 3.");
        }
        if(hasNull(param)||hasBlank(param)){
            throw new IllegalArgumentException("One or more element in chasers array is null or blank");
        }
     }

     // toString
     public String toString(){
        return  "House:   " + this.house                    + "\n" +
                "Keeper:  " + this.keeper                   + "\n" +         
                "Seeker:  " + this.seeker                   + "\n" +         
                "Chasers: " + Arrays.toString(this.chasers) + "\n";
     }

    // Comparison based on fields, not references
    public boolean equals(Object obj){
        // Check for null
        if(obj == null){
            return false;
        }
        // Check that the object is an instance of team
        if(!(obj instanceof Team)){
            return false;
        }
        // Typecast object to Team
        Team source = (Team)obj;
        // toString this.chasers and source.chasers for readable comparison
        String thisChasers = Arrays.toString(this.chasers);
        String sourceChasers = Arrays.toString(source.chasers);
        // Return comparison of fields
        return  (this.house.equals(source.house)    &&
                this.seeker.equals(source.seeker)   &&
                this.keeper.equals(source.keeper)   &&
                thisChasers.equals(sourceChasers)   );
     }

     
    public int hashCode() {
        return Objects.hash(house, keeper, seeker, Arrays.toString(chasers));
    }
}
