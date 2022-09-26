import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Magna Nordgard", "Norwegian", "23/09/1992", 1);

        if (person.applyForPassport() == true) {
            person.setPassport();
        }

        System.out.print(person.toString());
    }
  
  
}
