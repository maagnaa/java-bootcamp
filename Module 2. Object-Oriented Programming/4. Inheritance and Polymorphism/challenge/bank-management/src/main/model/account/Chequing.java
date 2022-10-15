package src.main.model.account;

import src.main.model.account.impl.Taxable;

public class Chequing extends Account implements Taxable{ 

    static final double OVERDRAFT_FEE = 5.5;
    static final double OVERDRAFT_LIMIT = 200.;
    static final double TAXFREE_INCOME_TRESHOLD = 3000;
    static final double INCOME_TAX_RATE = 0.15;

    public Chequing (String id, String name, double balance){
        super(id, name, balance);
    }

    public Chequing (Chequing source) {
        super(source.getId(),source.getName(),source.getBalance());
    }

    @Override
    public Account clone() {
        return new Chequing(this);
    }

    @Override
    public double tax(double income) {
        return round(income*INCOME_TAX_RATE);        
    }
    @Override
    protected double round(double amount) {
        return super.round(amount);
    }

    @Override
    public void deposit(double amount) {
        double depositAmount = amount;
        if(amount>TAXFREE_INCOME_TRESHOLD){
            depositAmount = amount - tax(amount);
        }
        super.setBalance(super.getBalance()+depositAmount);        
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = super.getBalance();

        if(amount > balance) {                              // Overdraft
            if( OVERDRAFT_LIMIT < amount-balance ) {        // Overdraft limit exceeded
                System.out.println("Withdrawal from chequing account aborted.\n"+
                                    "Expected overdraft of $"+(amount-balance)+
                                    " would exceed the overdraft limit of $"+OVERDRAFT_LIMIT);
                return false;
            }else{                                          // Overdraft within limit
                super.setBalance(round(balance - amount - OVERDRAFT_FEE)); 
                System.out.println("Overdraft withdrawal from chequing account completed.\n"+
                                   "An overdraft fee of $"+OVERDRAFT_FEE+" was applied.");
                return true;
            }
        }

        super.setBalance(round(balance-amount)); 
        return true;
    }



}
