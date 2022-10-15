package src.main.model.account;

public class Loan extends Account {
    
    static final double INTEREST_RATE = 1.02;

    public Loan (String id, String name, double balance){
        super(id, name, balance);
    }

    public Loan (Loan source) {
        super(source.getId(),source.getName(),source.getBalance());
    }

    @Override
    protected double round(double amount) {
        return super.round(amount);
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance()-amount);
    }

    @Override
    public boolean withdraw(double amount) {

        double balance = super.getBalance();
        double newBalance = round(balance + amount*INTEREST_RATE);

        if(newBalance>10000){
            System.out.println("Withdrawal from savings account aborted.\n" + 
                                "Expected loan balance $"+newBalance +
                                " would exceed the loan limit of $10.000");
            return false;
        }
        
        super.setBalance(newBalance);
        return true;
    }

}

