package models;
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("The name of the item cannot be blank.");
        }
        if(price<0){
            throw new IllegalArgumentException("The price of the item cannot be a negative number.");
        }
        if(quantity<0){
            throw new IllegalArgumentException("The quantity of an item cannot be a negative number");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;   
    }
    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("The name of the item cannot be blank.");
        }
        this.name = name;
    }
    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("The price of the item cannot be a negative number.");
        }
        this.price = price;
    }
    public void setQuantity(int quantity) {
        if(quantity<0){
            throw new IllegalArgumentException("The quantity of an item cannot be a negative number");
        }
        this.quantity = quantity;
    }

    public String toString() {
        return this.name + ": " + this.price + " ("+this.quantity+")";
    }

}
