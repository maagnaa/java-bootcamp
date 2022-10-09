import java.util.ArrayList;
import java.util.stream.Collectors;

public class Map {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> withTax = new ArrayList<Double>();
        
        withTax.addAll(
            prices.stream()
                .map((price) -> price * 1.13)       // Map updates and returns every element
                .collect(Collectors.toList()));
    }
}
