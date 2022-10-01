package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    /* Constructor */
    public Store(){
        this.movies = new ArrayList<Movie>();
    }

    /* Getters */
    public Movie getMovie(int index){
        // Care to return a new copy of the Movie object!
        return new Movie(this.movies.get(index)); 
    }

    /* Setters */
    public void setMovie(int index, Movie movie){
        // Should setMovie only set indexes that are within the current size of the ArrayList?
        // Not specified in workbook but in that case might want to 
        // throw an IllegalArgumentException if the index is larger than movies.size
        // as well as for a negative index (?)

        // Care to use a copy of the external movie object!
        this.movies.set(index, new Movie(movie));
    }

    /* Actions */

    /* addMovie
     * adds a movie to the ArrayList
     */
    public void addMovie(Movie movie){
        // Care to use a copy of the external movie object!
        this.movies.add(new Movie(movie));
    }

    // /* sellMovie
    //  * removes the movie that matches the name passed inn
    //  */
    // public void sellMovie(String movieName){
    //     for(int i=0;i<this.movies.size();i++){
    //         if(this.movies.get(i).getName().equals(movieName)){
    //             this.movies.remove(i);
    //         }
    //     }
    // }
    // /* rentMovie
    //  * sets isAvailable equal to false
    //  */
    // public void rentMovie(String movieName){
    //     for(int i=0;i<this.movies.size();i++){
    //         if(this.movies.get(i).getName().equals(movieName)){
    //             this.movies.get(i).setAvailability(false);
    //         }
    //     }
    // }
    // /*returnMovie 
    //  * sets isAvailable equal to true
    // */
    // public void returnMovie(String movieName){
    //     for(int i=0;i<this.movies.size();i++){
    //         if(this.movies.get(i).getName().equals(movieName)){
    //             this.movies.get(i).setAvailability(true);
    //         }
    //     }
    // }

    public void action(String movieName, String action){

        if(movies.isEmpty()){
            throw new IllegalStateException("Stor not in a valid state to perform any action!");
        }
        if(movieName==null||movieName.isBlank()){
            throw new IllegalArgumentException("Invalid movieName: cannot be blank or null!");
        }
        if(!(action.equalsIgnoreCase("sell")||action.equals("rent")||action.equals("return"))){
            throw new IllegalArgumentException("Invalid action: Must be 'sell','rent' or 'return'");
        }

        for(int i=0;i<this.movies.size();i++){
            if(this.movies.get(i).getName().equals(movieName)){
                switch (action){
                    case "sell":
                        if(this.movies.get(i).isAvailable()==false){
                            throw new IllegalArgumentException("Illegal action: cannot sell a movie that is not available!");
                        }
                        this.movies.remove(i);
                        break;
                    case "rent":
                        this.movies.get(i).setAvailability(false);
                        break;
                    case "return":
                        this.movies.get(i).setAvailability(true);
                        break;
                }
            }
        }
    }

    /* toString */

    public String toString(){
        String temp = "";

        for(int i=0;i<this.movies.size();i++){
            temp += this.movies.get(i).toString() + "\n\n";
        }
        return temp;
    }

}
