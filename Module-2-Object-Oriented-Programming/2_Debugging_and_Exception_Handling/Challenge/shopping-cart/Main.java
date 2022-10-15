import models.Cart;
import models.Item;
import models.Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();
    static Cart cart = new Cart();   

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        try{
            loadItems("products.txt");
            System.out.println(store.toString());
            manageItems();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Process Complete.");
        }

    }

    /**
     * Name: manageItems
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. Creates an infinite loop:     
     *   •        The user can choose to a) add or b) remove c) checkout.
     *   •          case a: asks for the aisle and item number. Then, adds item to cart.
     *   •          case b: asks for the name. Then, removes item from cart.
     *   •          case c: prints the receipt and closes Scanner.
     *   •        Prints the updated shopping cart.
     */
 
     public static void manageItems(){
        boolean exit = false;
        String itemName = "";
        String action = "";
        while(!exit){
            action = askUserAction();
            switch(action){
                case "a":
                    addItem();
                    break;
                case "b":
                    removeItem();
                    break;
                case "c":
                    checkout();
                    break;
                case "d":
                    System.out.println("You have chosen to exit without checkout.");
                    exit = true;
                    break;
            }

        }
     }

     public static String askUserAction(){
        String response = "";
        while(true){
            System.out.println("What would you like to do:          \n"+
                                    "\t a) Add an item to cart.     \n"+
                                    "\t b) Remove an item from cart.\n"+
                                    "\t c) Checkout                 \n"+
                                    "\t d) Exit.                    \n");

            response = scan.nextLine();

            if(response.equals("a")||response.equals("b")||response.equals("c")||response.equals("d")){
                break;
            }else{
                System.out.println("That is not a valid response. Please answer 'a' 'b' 'c' or 'd");
            }
        }

        System.out.println("You selected option "+ response +".");
        return response;
    }


    public static void addItem(){
        boolean exit = false;
        int row = -1;
        int column = -1;

        while(!exit){
            System.out.println("Enter the aisle number of the item you want to add to cart.");
            row = scan.nextInt();
            System.out.println("Enter the column number of the item you want to add to cart");
            column = scan.nextInt();
            scan.nextLine();
            if (!(row < 0 || row > 6 || column < 0 || column > 2)) {
                Item item = store.getItem(row, column);

                if(!cart.add(item)){
                    System.out.println(item.getName() + " is already in your shopping cart.");
                }else{
                    System.out.println(item.getName() + " was added to your shopping cart.");
                }
                System.out.println("Your cart: \n" + cart.toString());
                exit = true;
            }else{
                System.out.println( "You have entered an illegal value for row or column.\n" +
                                    "\tValid values for aisle number are: 0-6 \n"+
                                    "\tValid values for column number are: 0-2\n");
            }
        }
    }

    public static void removeItem(){
        String itemName = "";

        while(true){
            System.out.println("Enter the name of the item you want to remove from cart.");
            itemName = scan.nextLine();
            if(cart.checkItemExists(itemName)){
                cart.remove(itemName);
                break;
            }else{
                System.out.println("You dont have that item in your cart.");
            }
        }
    }

    public static void checkout(){
        if(cart.isEmpty()){
            System.out.println("Your cart is empty, you cannot perform checkout.");
        }else{
            System.out.println(cart.checkout());
        }
    }

    /**
     * Name: loadItems
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   1. loads items from <fileName>.txt.
     *      • while loop runs through every line in <fileName>
     *      • scan.nextLine() picks up the entire line.
     *      • splits each String using the ";" separator.
     *      • splits both fields in each String using the "=" separator.
     *      • Parse each price into a Double.
     *   2. adds all items to the store object's items field.
     */
    public static void loadItems(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        for (int i = 0; scanFile.hasNextLine(); i++) {
            String line = scanFile.nextLine();
            String[] items = line.split(";");
            for (int j = 0; j < items.length; j++) {
                String[] fields = items[j].split("=");
                store.setItem(i, j, new Item(fields[0],Double.parseDouble(fields[1])));
            }
        }
    }
}
