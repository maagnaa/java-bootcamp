import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();              // Polymorphism: we can declare as List instead
        list.add(1);
        list.add(2);        
        //LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();      // Polymorphism: we can declare as List instead
        list2.add(1);
        list2.add(2);
        list2.size();
        list2.isEmpty();
        list2.contains(0);
        list2.toArray();
    }
}
