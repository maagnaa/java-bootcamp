package src.main.model.account;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        try{
            checkNullOrEmpty(id);
            checkNullOrEmpty(name);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(Account source) {
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;       
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkNullOrEmpty(String string) throws IllegalArgumentException {
        if(string == null || string.isBlank()){
            throw new IllegalArgumentException("String parameter cannot be null or empty");
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "    " 
            + "\t" + id + "" 
            + "\t" + name + "" 
            + "\t$" + balance + "";
    }

}
