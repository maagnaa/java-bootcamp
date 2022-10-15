import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Magna");
        names.add("Pus");
        names.add("Nimi");
        names.add("Katrine");
        names.add("Frank");                             

        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        names.set(0, "Magna the Mindblown");
    }

    
}
