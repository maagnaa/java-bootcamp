package models;

public class Store {
    private Item[][] items;

    /* Constructor */
    public Store(){
        // The store is organized in seven rows (aisles) with space for three items each.
        this.items = new Item[7][3];
    }

    /* Getters */
    public Item getItem(int row, int column){
        return new Item(this.items[row][column]);
    }

    /* Setters */
    public void setItem(int row, int column, Item item){
        this.items[row][column] = new Item(item);
    }

    public boolean checkItemExists(String itemName){
        boolean itemExists = false;
        for(int i=0;i<this.items.length;i++){       // Loop through Rows/Aisles
            for(int j=0;j<items[i].length;j++){     // Loop through Columns
                if(items[i][j].getName().equals(itemName)){
                    itemExists = true;
                    break;
                }
            }
        }
        return itemExists;
    }

    /* toString */
    public String toString(){
        String temp = "\n*************************************** JAVA GROCERS ***************************************\n";

        for(int i=0;i<this.items.length;i++){   // Loop through Rows/Aisles
            switch (i) {
                case 0: temp += "DRINKS     \t>>\t"; break;
                case 1: temp += "CEREAL     \t>>\t"; break;
                case 2: temp += "DAIRY      \t>>\t"; break; 
                case 3: temp += "DELI       \t>>\t"; break; 
                case 4: temp += "GREENS     \t>>\t"; break; 
                case 5: temp += "CLOTHING   \t>>\t"; break; 
                case 6: temp += "ELECTRONICS\t>>\t"; break; 
            }        

            for(int j=0;j<items[i].length;j++){
                
                temp += items[i][j].toString() + "\t";
                if(items[i][j].toString().length()<16){
                    temp += "\t";
                }
            }

            temp += "\n";
        }
        temp +="********************************************************************************************\n";
        return temp;
    }

}
