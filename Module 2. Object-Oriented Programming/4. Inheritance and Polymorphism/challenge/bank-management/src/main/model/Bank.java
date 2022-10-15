package src.main.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * Name: addTransaction
     * @param transaction
     * 
     * Inside the function:
     *   1. adds a new transaction object to the array list.
     */
    private void addTransaction(Transaction transaction){
        this.transactions.add(new Transaction(transaction));
    }

    /**
     * Name: getTransactions
     * @param accountId (String)
     * @return (Transaction[])
     * 
     * 1. returns an array of transactions whose id matches the accountId 
     */
    public Transaction[] getTransactions(String accountId){
        List<Transaction> matchList = this.transactions.stream()
                                        .filter((transaction)->transaction.getId().equals(accountId))
                                        .collect(Collectors.toList());
        return matchList.toArray(new Transaction[matchList.size()]);
    }

    /**
   * Name: getAccount()
   * @param transactionId (String)
   * @return (Account)
   * 
   * 1. returns an account whose id matches a transaction. 
   */
  public Account getAccount(String transactionId){
    return this.accounts.stream()
                .filter(account -> account.getId().equals(transactionId))
                .findFirst().orElse(null);
  }

}
