package models;

public class Movie {
    private String name;
    private String format;              // Format is either "DVD" or "Blue-Ray"
    private double rating;              
    private double sellingPrice;        // Blue-Ray : 4.25   - DVD : 2.25
    private double rentalPrice;         // Blue-Ray : 1.99   - DVD : 0.99
    private boolean isAvailable;


    /* Constructor */
    public Movie(String name, String format, double rating){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("The movie name cannot be null or blank!");
        }
        if(!(format.equalsIgnoreCase("DVD")||format.equalsIgnoreCase("Blue-Ray"))){
            throw new IllegalArgumentException("The movie format must be either DVD or Blue-Ray!");
        }
        if(!((0<rating)&&(rating<=5))){
            throw new IllegalArgumentException("Rating must be a value between 0 and 5!");
        }

        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equals("DVD") ? 2.25 : 4.25;   
        this.rentalPrice = format.equals("DVD") ? 0.99 : 1.99;
        this.isAvailable = true;
    }

    /* Copy Constructor */
    public Movie(Movie source){
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    /* Getters */
    public String getName() {
        return name;
    }
    
    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /* Setters */
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("The movie name cannot be null or blank!");
        }
        this.name = name;
    }

    public void setFormat(String format){
        if(!(format.equalsIgnoreCase("DVD")||format.equalsIgnoreCase("Blue-Ray"))){
            throw new IllegalArgumentException("The movie format must be either DVD or Blue-Ray!");
        }
        this.format = format;
    }

    public void setRating(double rating){
        if(!((0<rating)&&(rating<=5))){
            throw new IllegalArgumentException("Rating must be a value between 0 and 5!");
        }

        this.rating = rating;
    }

    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public void setRentalPrice(double rentalPrice){
        this.rentalPrice = rentalPrice;
    }

    public void setAvailability(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    /* Actions */

    /* toString */
    public String toString() {
        return "\t Name:        \t\t" + this.name +             "\n" +
               "\t Format:      \t\t" + this.format +           "\n" +
               "\t Rating:      \t\t" + this.rating +           "\n" +
               "\t Selling Price: \t" + this.sellingPrice +     "\n" +
               "\t Rental Price:  \t" + this.rentalPrice +      "\n" +
               "\t Availability:  \t" + (this.isAvailable ? "in-stock" : "rented") + "\n";
    }
}
