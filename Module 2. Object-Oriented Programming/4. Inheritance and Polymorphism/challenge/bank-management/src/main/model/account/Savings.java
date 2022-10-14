package src.main.model.account;

public class Savings extends Account {

    public Savings(String id, String name, double balance){
        super(id, name, balance);
    }
 
    public Savings(Savings source) {
        super(source.getId(),source.getName(),source.getBalance());
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        return false;
    }
}
