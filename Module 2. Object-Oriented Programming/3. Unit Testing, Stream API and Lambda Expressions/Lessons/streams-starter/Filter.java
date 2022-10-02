import java.util.ArrayList;
import java.util.stream.*;

public class Filter {
    static ArrayList<Double> prices = new ArrayList<Double>();
    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream()
            .filter((price) -> {
                return price < 5;
            })
            .forEach((price) ->{
                System.out.println(price);
            });
    }
}
