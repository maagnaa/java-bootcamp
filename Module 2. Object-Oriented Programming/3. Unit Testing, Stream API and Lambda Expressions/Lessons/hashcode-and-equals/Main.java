import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        
        Car nissan = new Car("Nissan",2016);
        System.out.println(("Nissan Hashcode\t\t=>\t"+nissan.hashCode()));

        Car toyota = new Car("Toyota",2016);
        System.out.println(("Toyota Hashcode\t\t=>\t"+toyota.hashCode()));

        Car nissan2 = new Car(nissan);
        System.out.println(("Nissan2 Hashcode\t=>\t"+nissan2.hashCode()));

        HashMap<Car,Double> prices = new HashMap<Car,Double>();
        prices.put(nissan, 10000.);
        prices.put(toyota,12000.);

        System.out.println(prices.get(nissan2));
    }

}
