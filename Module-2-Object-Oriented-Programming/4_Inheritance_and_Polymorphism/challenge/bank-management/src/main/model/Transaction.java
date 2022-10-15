package src.main.model;

import java.util.Objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Comparable<Transaction> {
    public enum Type {WITHDRAW, DEPOSIT};

    private Type type;
    private long timestamp;
    private String id;
    private double amount;

    private final String DATE_PATTERN = "dd/MM/yyyy";

    public Transaction(Type type, long timestamp, String id, double amount) throws IllegalArgumentException{
        checkNullOrBlank(id, "id @ Transaction() cannot be null or empty.");
        checkIllegalAmount(amount, "amount @ Transaction() cannot be equal to or less than 0.");
        this.type = type;
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
    }

    
    public Transaction(Transaction source) {
        this.type = source.type;
        this.timestamp = source.timestamp;
        this.id = source.id;
        this.amount = source.amount;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        checkNullOrBlank(id, "id @ setId() cannot be null or empty. ");
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        checkIllegalAmount(amount, "amount @ setAmount() cannot be equal to or less than 0.");
        this.amount = amount;
    }

    public String getReadableDate() {
        Date date = new Date(this.getTimestamp()*1000);
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
        formatter.setLenient(false);
        String readableDate = formatter.format(date);

        return readableDate;
    }

    public void checkNullOrBlank(String string, String msg) throws IllegalArgumentException {
        if(string == null || string.isBlank()){
            throw new IllegalArgumentException(msg);
        }
    }

    public void checkIllegalAmount(double amount, String msg) throws IllegalArgumentException {
        if(amount <= 0){
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return timestamp == transaction.timestamp && Objects.equals(id, transaction.id) && amount == transaction.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, id, amount);
    }

    @Override
    public int compareTo(Transaction specifiedObject) {
        return Double.compare(this.getTimestamp(), specifiedObject.getTimestamp());
    }


    @Override
    public String toString() {
        return  String.format("%1$10s", getType()) +
        "\t"  + getTimestamp()  + "  " +
        "\t"  + getId()         + "  " +
        "\t$" + getAmount()     + "  " ;
    }

}


