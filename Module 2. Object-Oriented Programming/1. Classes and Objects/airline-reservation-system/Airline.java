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
}
