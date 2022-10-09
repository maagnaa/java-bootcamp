import java.util.ArrayList;
import java.util.stream.Collectors;

public class OperationChain {
    static ArrayList<Double> prices = new ArrayList<Double>();
    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> updatePrices = new ArrayList<Double>();
        updatePrices.addAll(prices.stream()
            .filter((price)-> price < 5)        // Filter prices lower than 5
            .map((price) -> price*1.13)         // Add tax to prices lower than 5
            .collect(Collectors.toList()));     // Return the filtered and taxed prices as a list

    }
    
}