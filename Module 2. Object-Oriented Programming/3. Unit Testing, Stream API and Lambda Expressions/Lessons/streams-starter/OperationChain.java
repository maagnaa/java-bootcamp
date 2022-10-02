import java.util.ArrayList;

public class OperationChain {
    static ArrayList<Double> prices = new ArrayList<Double>();
    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> updatePrices = new ArrayList<Double>();
        filterLowPrices(updatePrices);
        tax(updatePrices);

    }
    
    // Filtes prices lower than 5 
    public static void filterLowPrices(ArrayList<Double> lowPrices) {
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                lowPrices.add(prices.get(i));
            }
        }
    }
    // Updates each price by adding the tax
    public static void tax(ArrayList<Double> withTax) {
        for (int i = 0; i < withTax.size(); i++) {
                withTax.set(i, withTax.get(i) * 1.13);
        }
    }
}
