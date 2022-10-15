package models;

// Parent class for Shirt and Pants
public abstract class Product implements Comparable<Product>{
    private double price;
    private String color;
    private String brand;


    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product(Product source){
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;        
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void fold();

    @Override
    /* Task: sort the products in alphabetical order, based on their class type, then sort the rest by price.
     *
     * Returns "a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object."
     * Meaning : 
     *      - if it returns a negative integer - the object is less than
     *      - if it returns zero - the object is equal
     *      - if it returns a positive integer - the objects is greater
     */
   
    public int compareTo(Product specifiedObject) {
        String className = this.getClass().getSimpleName();
        String sClassName = specifiedObject.getClass().getSimpleName();
        Double price = this.getPrice();
        Double sPrice = specifiedObject.getPrice();

        if(!(className.equals(sClassName))){
            return className.compareTo(sClassName);
        }

        return price.compareTo(sPrice);
    }


}
