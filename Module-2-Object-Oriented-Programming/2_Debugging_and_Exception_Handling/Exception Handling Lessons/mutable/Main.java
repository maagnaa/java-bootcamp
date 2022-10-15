public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable or Immutable?

        // Another name for "setter" is mutator
        // It follows that objects with setter methods are mutable objects
        // -> Their value can be changed after creation

        car.setMake("Honda");
    }
}
