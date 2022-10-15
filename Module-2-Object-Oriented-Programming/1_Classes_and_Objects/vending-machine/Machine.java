import java.util.Arrays;

// The vending machine has 9 different items arranged in 3 rows
// Each spot in the machine shows the name, price, and quantity of the item.
// The vending machine dispenses an item if its quantity is bigger than zero.

public class Machine {
    
    private Item[][] items;

    // Constructor method
    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];

        for(int i=0; i<items.length; i++){              // Loop through rows
            for(int j=0; j<items[i].length;j++){        // Loop through columns
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    // Getters
    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }
    // Setters
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    // toString
    public String toString() {

        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }
    // Actions
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

    public boolean dispense(int row, int spot) {
        if (this.items[row][spot].getQuantity() > 0) {
            items[row][spot].setQuantity(items[row][spot].getQuantity() - 1);
            return true;
        } 
        return false;
    }
}
