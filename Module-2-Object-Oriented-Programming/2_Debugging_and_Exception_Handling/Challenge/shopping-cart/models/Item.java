package models;

public class Item {
    private String name;
    private double price;
  
    /* Constructor */
    public Item(String name, double price){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Item: name cannot be null or blank.");
        }else if(price<0){
            throw new IllegalArgumentException("Item: price cannot be less than 0");
        }

        this.name = name;
        this.price = price;
    }

    /* Copy Constructor */
    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
    }

    /* Getters */
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    /* Setters */
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Item: name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setPrice(double price){
        if(price<0){
            throw new IllegalArgumentException("Item: price cannot be less than 0");
        }
        this.price = price;
    }

    /* Equality Checker */
    /* Overload the equals method to evaluate copies and not reference equality */
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Item)){
            return false;
        }
        Item item = (Item)obj;
        return (this.name.equals(item.name) && this.price==item.price);
    }

    /* To String */
    public String toString(){
        return (this.name + ": $" + this.price + " ");
    }
}
