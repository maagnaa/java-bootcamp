package models;

import java.util.ArrayList;


public class Cart {
    private ArrayList<Item> items;

    /* Constructor */
    public Cart(){
        this.items = new ArrayList<Item>();
    }

    /* Getters */
    public Item getItem(int index){
        return new Item(items.get(index));
    }

    /* Setters */
    public void setItem(int index, Item item){
        this.items.set(index,new Item(item));
    }

   /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */
    public boolean add(Item item){
        if(this.items.contains(item)){
            return false;
        }
        this.items.add(new Item(item));
        return true;
    }
 
 
  
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
    public void remove(String name){
        if(this.items.isEmpty()){
            throw new IllegalArgumentException("Cart: Cannot remove items from an empty cart!");
        }

        boolean itemFound = false;
        for(int i=0;i<items.size();i++){
            if(items.get(i).getName().equals(name)){
                this.items.remove(i);
                itemFound = true;
                break;
            }
        }
        
        if(itemFound==false){
            System.out.println("Cart item not found. Item not removed.");
        }
    }
    
 
  
  
   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    public String checkout(){
        double subtotal = 0;
        double tax = 0;
        double total = 0;
        
        for(int i=0;i<items.size();i++){
            subtotal += this.items.get(i).getPrice();
        }

        tax = subtotal*0.13;
        total = subtotal + tax;

        return ("\tRECEIPT\n\n" +
                "\tSubtotal:  \t$" + subtotal   +   "\n" +
                "\tTax:     \t\t$" + tax        +   "\n" +
                "\tTotal:   \t\t$" + total +        "\n" );
    }

    /* isEmpty */
    public boolean isEmpty() {
        return this.items.isEmpty();
    }


    /* toString */
    public String toString(){
        String temp = "";

        for(int i=0;i<items.size();i++){
            temp += items.get(i).toString() + "\n";
        }
        return temp;
    }
}
