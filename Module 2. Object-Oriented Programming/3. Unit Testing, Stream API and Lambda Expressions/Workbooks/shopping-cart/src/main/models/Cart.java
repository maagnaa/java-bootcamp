package src.main.models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

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

    public boolean itemExists(String name){
        return this.items.stream().anyMatch(item -> item.getName().equals(name));
    }

    public boolean contains(Item item){
        return this.items.stream().anyMatch(sItem -> sItem.equals(item));
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
