package src.main;

import java.util.concurrent.TimeUnit;

import src.main.model.*;
import src.main.model.account.*;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

    public static void main(String[] args) {

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


        // Bank bank = new Bank();
        // Account[] accounts = new Account[] {
        //     new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51),
        //     new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60)
        // };

        // for (Account account : accounts) {
        //     bank.addAccount(account);
        // }

        // Transaction[] transactions = new Transaction[] {
        //     new Transaction(Transaction.Type.WITHDRAW, 1546905600, "f84c43f4-a634-4c57-a644-7602f8840870", 624.99),
        //     new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 441.93),
        //     new Transaction(Transaction.Type.WITHDRAW, 1547078400, "f84c43f4-a634-4c57-a644-7602f8840870", 546.72),
        //     new Transaction(Transaction.Type.WITHDRAW, 1546732800, "f84c43f4-a634-4c57-a644-7602f8840870", 546.72),
        //     new Transaction(Transaction.Type.DEPOSIT, 1578355200, "f84c43f4-a634-4c57-a644-7602f8840870", 635.95),
        //     new Transaction(Transaction.Type.WITHDRAW, 1547078400, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 875.64),
        //     new Transaction(Transaction.Type.WITHDRAW, 1578614400, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 912.45),
        //     new Transaction(Transaction.Type.WITHDRAW, 1577836800, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 695.09),
        //     new Transaction(Transaction.Type.WITHDRAW, 1609459200, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 917.21),
        //     new Transaction(Transaction.Type.WITHDRAW, 1578096000, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 127.94),
        //     new Transaction(Transaction.Type.WITHDRAW, 1546819200, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 612.52)
        // };

        // for (Transaction transaction : transactions) {
        //     bank.addTransaction(transaction);
        // }
        
        // Transaction[] filteredTransactions = bank.getTransactions("f84c43f4-a634-4c57-a644-7602f8840870");
        // Account account = bank.getAccount("ce07d7b3-9038-43db-83ae-77fd9c0450c9");
