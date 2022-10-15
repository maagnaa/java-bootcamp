package src.main.model.account;

public class Savings extends Account {

    static final double WITHDRAWAL_FEE = 5.0;

    public Savings(String id, String name, double balance){
        super(id, name, balance);
    }
 
    public Savings(Savings source) {
        super(source.getId(),source.getName(),source.getBalance());
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance()+amount);        
    }

    /* Assignment does not specify a withdrawal limit in requirements
     */
    @Override
    public boolean withdraw(double amount) {
        double balance = super.getBalance();

        super.setBalance(balance-amount-WITHDRAWAL_FEE);
        return true;
    }
}
