import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


import models.*;
import java.util.Arrays;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        try{
            Product[] products = getData();
            System.out.println("Before Sort \n");
            printArray(products);

            Arrays.sort(products);

            System.out.println("\n\nAfter Sort \n");
            printArray(products);

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
    public static Product[] getData() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("products.txt");
        Scanner scan = new Scanner(fis);
        Product[] products = new Product[18];

        for (int i = 0; scan.hasNextLine(); i++){
            switch (scan.next()){
                case "PANTS":
                    products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next());
                    break;
                case "SHIRT":
                    products[i] = new Shirt(Shirt.Size.valueOf(scan.next()),scan.nextDouble(),scan.next(),scan.next());
                    break;
            }
        }

        return products;
    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }
    }
}


// -----------------------------------------------------------------------------------------------
        
// Shirt shirt1 = new Shirt(Shirt.Size.SMALL,15.99,"BLUE","JAVA VUITTON");
// Shirt shirt2 = new Shirt(shirt1);

// Pants pants1 = new Pants(32, 24.99, "BLUE", "JAVA KLEIN");
// Pants pants2 = new Pants(pants1);
// Pants pants3 = new Pants(34, 104.99, "RED", "JANGLER");

// // Use methods inherited from parent class
// shirt1.getPrice();
// pants1.setPrice(59.99);
// pants1.setWaist(40);
// pants2.setBrand("JAVAMODA");

// //shirt1.fold();
// //pants1.fold();
// pants1.discount();

// System.out.println("shirt1 = "+shirt1.toString());
// System.out.println("shirt2 = "+shirt2.toString());

// System.out.println("pants1 = "+pants1.toString());
// System.out.println("pants2 = "+pants2.toString());
// System.out.println("pants3 = "+pants3.toString());

// System.out.println("Shirt1 == Shirt2 ? -> " + shirt1.equals(shirt2));  // Evaluates TRUE
// System.out.println("Pants1 == Pants2 ? -> "+ pants1.equals(pants2));   // Evaluates FALSE  

// System.out.println("pants2.compareTo(pants1) = "+pants2.compareTo(pants1));
// System.out.println("pants3.compareTo(pants1) = "+pants3.compareTo(pants1));


// -----------------------------------------------------------------------------------------------

// Product[] products = new Product[] {
//     new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
//     new Pants(34, 104.99, "Red", "JANGLER"),
//     new Pants(30, 119.99, "Grey", "FENDI"),
//     new Pants(30, 129.99, "Red", "VERSACE"),
//     new Pants(29, 99.99, "Dark", "JANGLER"),
//     new Pants(26, 24.99, "Indigo", "BELSTAFF"),
//     new Pants(34, 104.99, "Red", "JANGLER"),
// };

// System.out.println("Before Sort \n");
// printArray(products);

// Arrays.sort(products);

// System.out.println("After Sort \n");
// printArray(products);

// -----------------------------------------------------------------------------------------------

// Product[] products = new Product[] {
//     new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
//     new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
//     new Pants(34, 24.53, "Red", "JANGLER"),
//     new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
//     new Pants(30, 24.54, "Grey", "FENDI"),
//     new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
//     new Pants(30, 24.51, "Red", "VERSACE"),
//     new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
//     new Pants(29, 24.53, "Dark", "JANGLER"),
//     new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
//     new Pants(26, 24.58, "Indigo", "BELSTAFF"),
//     new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
//     new Pants(34, 24.50, "Red", "JANGLER"),
// };


// System.out.println("Before Sort \n");
// printArray(products);

// Arrays.sort(products);

// System.out.println("\n\nAfter Sort \n");
// printArray(products);
