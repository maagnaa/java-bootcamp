public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        /* Item[][] items = new Item[][] {
        /     { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
        /     { new Item("Fanta", 1.99, 2) , new Item("Barqs", 1.49, 2), new Item("A & W", 2.49, 3) },
        /     { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        / };
        */

        Item[] items = new Item[] {
            new Item("Fanta", 1.99, 2), 
            new Item("Barqs", 1.49, 2), 
            new Item("A & W", 2.49, 3)
        };

        System.out.println(items[0].toString());
        System.out.println(items[1].toString());
        System.out.println(items[2].toString());

    }
}
