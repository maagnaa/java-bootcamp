package src.main.model.account;

import java.text.DecimalFormat;

public abstract class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) throws IllegalArgumentException {
        checkNullOrBlank(id,"id @ Account() cannot be null or blank.");
        checkNullOrBlank(name, "name @ Account() cannot be null or blank.");
        
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

    public void setId(String id) throws IllegalArgumentException {
        checkNullOrBlank(id,"id @ setId() cannot be null or blank.");
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IllegalArgumentException {
        checkNullOrBlank(name,"name @ setName() cannot be null or blank.");
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);


    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }

    public void checkNullOrBlank(String string, String msg) throws IllegalArgumentException {
        if(string == null || string.isBlank()){
            throw new IllegalArgumentException(msg);
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
