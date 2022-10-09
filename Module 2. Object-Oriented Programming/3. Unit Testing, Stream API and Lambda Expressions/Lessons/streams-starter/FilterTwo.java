import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterTwo {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> lowPrices = new ArrayList<Double>();
    
        lowPrices.addAll(
            prices.stream()
                .filter((price) -> price < 5)       // Intermediate operation that updates the stream by filtering the elements based on a predicate
                .collect(Collectors.toList()));     // Collect is a terminal operation that ends the pipeline. It collects the updated sequence of objects. 
                                                    // The updated sequence is returned as a list [since we use .toList()] 
                                                    
                                                    
    }


}
