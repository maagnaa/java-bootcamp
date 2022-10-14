import java.io.FileInputStream;
import java.io.FileNotFoundException;

import models.*;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        
        Shirt shirt1 = new Shirt(Shirt.Size.SMALL,15.99,"BLUE","JAVA VUITTON");
        Shirt shirt2 = new Shirt(shirt1);

        Pants pants1 = new Pants(32, 24.99, "BLUE", "JAVA KLEIN");
        Pants pants2 = new Pants(pants1);

        // Use methods inherited from parent class
        shirt1.getPrice();
        pants1.setPrice(59.99);

        System.out.println("shirt1 = "+shirt1.toString());
        System.out.println("shirt2 = "+shirt2.toString());

        System.out.println("pants1 = "+pants1.toString());
        System.out.println("pants2 = "+pants2.toString());

        pants1.discount();

        System.out.println("Shirt1 == Shirt2 ? -> " + shirt1.equals(shirt2));  // Evaluates TRUE
        System.out.println("Pants1 == Pants2 ? -> "+ pants1.equals(pants2));   // Evaluates FALSE  


        shirt1.fold();
        pants1.fold();

        System.out.println("shirt1 = "+shirt1.toString());
        System.out.println("shirt2 = "+shirt2.toString());

        System.out.println("pants1 = "+pants1.toString());
        System.out.println("pants2 = "+pants2.toString());

    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
    // public static Product[] getData() throws FileNotFoundException{
    //     FileInputStream fis = new FileInputStream("products.txt");
    //     Scanner scanFile = new Scanner(fis);
    //     Product[] products;

    //     while(scanFile.hasNextLine()){

    //     }
    // }

}
