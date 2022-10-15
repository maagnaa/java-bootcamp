package src.main.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import src.main.model.Transaction;
import src.main.model.account.*;
import src.main.model.account.impl.Taxable;


public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public static final String CHEQUING = "Chequing";
    public static final String SAVINGS = "Savings";
    public static final String LOAN = "Loan";

    static final double TAXFREE_INCOME_TRESHOLD = 3000;


    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }

    /**
     * Name: addAccount
     * @param account (Account)
     * 
     *      Adds an account to the accounts ArrayList.
     */
    public void addAccount(Account account){
        this.accounts.add(account.clone());    
    }

    /**
     * Name: addTransaction
     * @param transaction
     * 
     *      Adds a new transaction object to the array list.
     */
    //private void addTransaction(Transaction transaction){
    public void addTransaction(Transaction transaction){    
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
     * Name: getAccountFromId()
     * @param transactionId (String)
     * @return (Account)
     * 
     * 1. returns an account whose id matches a transaction id. 
     */
    public Account getAccountFromId(String transactionId){
        return this.accounts.stream()
                    .filter(account -> account.getId().equals(transactionId))
                    .findFirst().orElse(null);
    }

    /**
     * Name: getAccount
     * @param transaction (Transaction)
     * @return (Account)
     * 
     * 1. returns an account whose id matches a transaction. 
     */
    public Account getAccount(Transaction transaction){
        return getAccountFromId(transaction.getId());
    }

      /**
     * Name: withdrawTransaction
     * @param transaction (Transaction)
     * 
     *      Performs an account withdrawal.
     */
    private void withdrawTransaction(Transaction transaction){

        if(getAccount(transaction).withdraw(transaction.getAmount())){
            addTransaction(transaction);
        }
    }

    /**
     * Name : depositTransaction
     * @param transaction (Transaction)
     *      
     *      Performs an account deposit.
     */
    private void depositTransaction(Transaction transaction){
        getAccount(transaction).deposit(transaction.getAmount());
        addTransaction(transaction);
    }

    /**
     * Name: transaction
     * @param transaction
     * 
     *      Executes a transaction based on the transaction type.
     */
    public void executeTransaction(Transaction transaction){
        switch(transaction.getType()){
            case WITHDRAW:  withdrawTransaction(transaction);   break;
            case DEPOSIT:   depositTransaction(transaction);    break;
        }
    }

    /**
     * Name: getIncome
     * @param account (Taxable)
     * @return double
     * 
     * Inside the function:
     *   1. Gets every transaction that matches the account's id.
     *   2. Maps every transaction to a double.
     *       - Transactions of type WITHDRAW are mapped to negative numbers.
     *       - Transactions of type DEPOSIT are mapped to positive numbers.
     *   3. Takes the sum of every number and returns the income.
     * 
     */ 
    private double getIncome(Taxable account){
        String accountId = ((Chequing)account).getId();         // Typecast account to Chequing, the only account
                                                                // which implements the Taxable interface.

        Transaction[] transactions = getTransactions(accountId);

        double income = Arrays.stream(transactions)             // Treat transactions array as a stream
                            .mapToDouble((transaction) -> {                 // Intermediate operation mapToDouble
                                switch(transaction.getType()){              // returns a Double value for every
                                    case WITHDRAW:                          // element in the Array specified by
                                        return -transaction.getAmount();    // Arrays.stream(). We differenciate
                                    case DEPOSIT:                           // by transaction type whether to
                                        return  transaction.getAmount();    // return as a positive or negative 
                                    default: return 0;                      // number.
                                }}).sum();                      // Terminal operation sum() adds all the double
                                                                // values coming from the previous stage of
                                                                // the pipeline (from .mapToDouble()).

        return income;
    }

    /**
     * Name: deductTaxes
     * 
     */

    public void deductTaxes(){
        accounts.stream()
            .filter(account ->  Taxable.class.isAssignableFrom(account.getClass())) // find taxable accounts
            .forEach(account -> {
                Taxable taxable = (Taxable) account;        // Typecast to Taxable
                double income = getIncome(taxable);         // Get the income of the account

                if( income > TAXFREE_INCOME_TRESHOLD){      // If income exceeds threshold
                    taxable.tax(income);                    // Apply tax
                }
            });
    }
}
