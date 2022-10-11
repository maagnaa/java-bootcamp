import java.util.HashMap;

public class KeyValues {
    public static void main(String[] args) {
        HashMap<String,Double> items = new HashMap<String,Double>();
        items.put("Cauliflower",4.99);
        items.put("Spaghetti Squash",1.99);
        items.put("Parsley",6.99);

        items.forEach((key,value) -> System.out.println(key+": "+value));        
    }
}
