import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        Person[] people = new Person[] { 
            new Person("Cleopatra", "Egypt", "69 BC", 1),               //  0
            new Person("Alexander the Great", "Macedon", "356 BC", 2),  //  1
            new Person("Julius Caesar", "Rome", "100 BC", 3),           //  2
            new Person("Hannibal", "Carthage", "247 BC", 4),            //  3
            new Person("Confucius", "China", "551 BC", 5),              //  4
            new Person("Pericles", "Greece", "429 BC", 6),              //  5
            new Person("Spartacus", "Thrace", "111 BC", 7),             //  6
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),         //  7
            new Person("Leonidas", "Greece", "540 BC", 9),              //  8
            new Person("Sun Tzu", "China", "544 BC", 10),               //  9
            new Person("Hammurabi", "Babylon", "1750 BC", 11),          // 10
        };

       Airline airline = new Airline();

       for(int i=0; i<=10; i++){
            airline.setPerson(people[i]);
       }

       // Test
       System.out.print(airline.getPerson(1).toString());
       System.out.print(airline.getPerson(5).toString());
       System.out.print(airline.getPerson(10).toString());

    }
  
  
}
