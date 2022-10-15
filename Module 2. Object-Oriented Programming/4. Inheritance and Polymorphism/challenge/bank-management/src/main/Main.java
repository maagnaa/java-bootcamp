package src.main;

import java.util.concurrent.TimeUnit;

import src.main.model.account.*;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

    public static void main(String[] args) {
        Chequing chequing = new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51);
        Savings savings = new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60);
        Loan loan = new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31);

        System.out.println("\nTest: toString \n\n"
                    + chequing.toString() + "\n"
                    + savings.toString()  + "\n"
                    + loan.toString()+"\n\n");

        Account chequingCopy = chequing.clone();          
        Account savingsCopy = savings.clone();

        System.out.println("Test: clone \n\n"
                    + chequingCopy.toString() + "\n"
                    + savingsCopy.toString());
    }

    /**
     * Function name: wait
     * @param milliseconds
     * 
     * Inside the function:
     *  1. Makes the code sleep for X milliseconds.
     */

     public static void wait(int milliseconds) {
         try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
