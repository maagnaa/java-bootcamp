public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Zack",27);
        Person person2 = person1;                            // Person 2 and Person1 share the same reference
        Person person3 = new Person(person1);                // Person 3 and Person1 have different references but equal fields
        Object person4 = new Person(person1);                // Polymorphism
        
        System.out.println(person1.equals(person2));         // Evaluates true with default .equals() which checks reference equality
        System.out.println("Person1 Hashcode: " + person1.hashCode());
        System.out.println("Person2 Hashcode: " + person2.hashCode());

        System.out.println(person1.equals(person3));         // Evaluates false with default .equals() which checks for reference equality
        System.out.println("Person1 Hashcode: " + person1.hashCode());
        System.out.println("Person3 Hashcode: " + person3.hashCode());

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());


    } 
}
