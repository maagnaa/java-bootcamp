public class Airline {
    private Person[] seats;

    public Airline(){
        this.seats = new Person[11]; // Max 11 seats
    }

    public Person getPerson(int index){
        // Making sure to return a *new* person object
        return new Person(this.seats[index]);
    }
    
    public void setPerson(Person person){
        int index = person.getSeatNumber()-1;

        // Making sure to set the element equal to a *new* copy of the object
        this.seats[index] = new Person(person);
    }

    public void createReservation(Person person){

        while(seats[person.getSeatNumber()-1]!=null){
            System.out.println( person.getName()+", seat "+person.getSeatNumber()+" is already taken. Please choose another seat. \n");
            person.chooseSeat();
        }

        int index = person.getSeatNumber()-1;

        this.seats[index] = new Person(person);

        System.out.println( "Thank you " + person.getName() + " for flying with Java airlines.\n" +
                            "Your seat number is " + person.getSeatNumber() + ".\n");
    }

    public String toString(){
        String temp = "";

        for(int i=0; i<seats.length; i++){
            // Check that seats[i] is not null. Otherwise this will cause a null pointer exception.
            if(seats[i]!= null){     
                temp = temp + seats[i].toString() + "\n\n";
            }else{
                temp = temp + "Seat " + (i+1) + " is empty. \n\n";
            }
        }

        return temp;
    }
}
