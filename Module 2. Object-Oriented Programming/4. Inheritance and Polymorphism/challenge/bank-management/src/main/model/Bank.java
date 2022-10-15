package src.main.model;

import java.util.ArrayList;

import src.main.model.Transaction;
import src.main.model.account.*;


public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public static final String CHEQUING = "Chequing";
    public static final String SAVINGS = "Savings";
    public static final String LOAN = "Loan";

    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }

    /**
     * Name: addAccount
     * @param account (Account)
     * 
     * Inside the function:
     *   1. adds an account to the accounts ArrayList
     */
    public void addAccount(Account account){
        this.accounts.add(account.clone());    
    }

  
}
