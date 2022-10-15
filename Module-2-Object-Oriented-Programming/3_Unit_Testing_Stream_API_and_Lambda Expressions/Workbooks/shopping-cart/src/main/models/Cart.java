package src.main.models;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.text.DecimalFormat;


public class Cart {
    ArrayList<Item> items;
    private static final double TAX_RATE = 0.13;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    /**
     * Function name: add
     * @param item 
     * 
     * Inside the function:
     *   1. adds an Item object
     */
    public boolean add(Item item){
        if(contains(item)){
            return false;
        }

        this.items.add(new Item(item));
        return true;
    }

    /**
    * Function name: remove
    * @param name
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. removes the item that matches the name passed in. 
    */
    public void remove(String name){
        if(!(contains(name))){
            throw new IllegalStateException("Cannot remove an item that has not been added to the cart");
        }

        this.items.removeIf(item -> item.getName().equals(name));
    }

    public boolean contains(String name){
        return this.items.stream().anyMatch(item -> item.getName().equals(name));
    }

    public boolean contains(Item item){
        return this.items.stream().anyMatch(sItem -> sItem.equals(item));
    }

    /**
    * Function name: getSubtotal
    * @return double
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. adds the price field of each Item object. 
    *   3. returns the sum
    */
    public double getSubtotal(){
        return this.items.stream().collect(Collectors.summingDouble(Item::getPrice)); 
        
        // Alternative from solution:
        // return this.items.stream().mapToDouble((item) -> item.getPrice()).sum();
    }

    /**
    * Function name: getTax
    * @param double (subtotal)
    * @return double
    * 
    * Inside the function:
    *   1. calculates tax
    *   2. rounds to two decimal places
    *   3. returns the result
    */
    public double getTax(double subtotal){
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(subtotal*TAX_RATE));
    }

    /**
    * Function name: getTotal
    * @param double (subtotal)
    * @param double (tax)
    * @return (double)
    * 
    * Inside the function:
    *   1. returns subtotal + tax
    */
    public double getTotal(double subtotal, double tax){
        return (subtotal + tax);
    }

    
    public String checkout(){
        if(this.items.isEmpty()){
            throw new IllegalStateException("Cannot checkout empty cart!");
        }

        return ("\tRECEIPT\n\n" +
                "\tSubtotal: \t$" + getSubtotal()                                   + "\n" +
                "\tTax:      \t$" + getTax(getSubtotal())                           + "\n" +
                "\tTotal:    \t$" + getTotal(getSubtotal(), getTax(getSubtotal()))  + "\n");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}
