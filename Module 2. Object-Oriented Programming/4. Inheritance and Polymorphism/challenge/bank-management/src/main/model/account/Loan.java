package src.main.model.account;

public class Loan extends Account {

    public Loan (String id, String name, double balance){
        super(id, name, balance);
    }

    public Loan (Loan source) {
        super(source.getId(),source.getName(),source.getBalance());
    }
}
