package src.main.model.account;

public class Chequing extends Account { 

    static final double OVERDRAFT_FEE = 5.5;
    static final double OVERDRAFT_LIMIT = 200.;

    public Chequing (String id, String name, double balance){
        super(id, name, balance);
    }

    public Chequing (Chequing source) {
        super(source.getId(),source.getName(),source.getBalance());
    }


    @Override
    protected double round(double amount) {
        return super.round(amount);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = super.getBalance();

        if(amount > balance) {                              // Overdraft
            if( OVERDRAFT_LIMIT < amount-balance ) {        // Overdraft limit exceeded
                return false;
            }else{                                          // Overdraft within limit
                super.setBalance(round(balance - amount - OVERDRAFT_FEE)); 
                return true;
            }
        }

        super.setBalance(round(balance-amount)); 
        return true;
    }



}
