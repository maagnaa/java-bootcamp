package src.main.models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    /**
    * Function name: addMovie
    * @param movie 
    * 
    * Inside the function:
    *   1. adds a movie object
    */
    public void addMovie(Movie movie){
        this.movies.add(new Movie(movie));
    }

    /**
     * Function name: contains
     * @param movie
     * @return (boolean)
     * 
     * Inside the function:
     *    1. checks if movies list contains() movie.
     */
     public boolean contains(Movie movie){
        return this.movies.contains(movie);
     }

    /**
    * Function name: sellMovie
    * @param name (String)
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. removes the movie that matches the name passed in. 
    */
    public void sellMovie(String name){
        if(!(movieExists(name))){
            throw new IllegalArgumentException("Cannot sell a movie that does not exist in store");
        }
        if(!(movieIsAvailable(name))){
            throw new IllegalStateException("Cannot sell a movie that is not available");
        }

        this.movies.removeIf(movie -> movie.getName().equals(name));

    }

    /**
     * Function name: rentMovie
    * @param name
    * 
    * Inside the function:
    *   1. Loop runs through every element
    *   2. Set the matching element's availability to false.
    * 
    */
    public void rentMovie(String name){
        if(!(movieExists(name))){
            throw new IllegalArgumentException("Cannot rent a movie that does not exist in store");
        }

        this.movies.stream()                
            .filter(movie -> movie.getName().equals(name))
            .forEach(movie -> movie.setAvailable(false));
    }


    /**
     * Function name: returnMovie
     * @param name
     * 
     * Inside the function:
     *   1. Set the movie's availability to true.
     */
    public void returnMovie(String name){
        if(!(movieExists(name))){
            throw new IllegalArgumentException("Cannot return a movie that does not exist in store!");
        }
        if(movieIsAvailable(name)){
            throw new IllegalStateException("Cannot return a movie that is marked as available in store!");
        }

        this.movies.stream()
            .filter(movie -> movie.getName().equals(name))
            .forEach(movie -> movie.setAvailable(true));
    }
    /**
     * Function name: movieExists
     * @param movieName
     * @return (boolean)
     * 
     * Inside the function:
     *    1. checks if a movie with name movieName exists in store
     */
    public boolean movieExists(String movieName){
        return this.movies.stream().anyMatch(movie -> movie.getName().equals(movieName));
    }

    /**
     * Function name: movieIsAvailable
     * @param movieName
     * @return (boolean)
     * 
     * Inside the function:
     *    1. checks if a movie with name movieName has a isAvailable value equal to TRUE
     */
    public boolean movieIsAvailable(String movieName){
        return this.movies.stream()
                .filter(movie -> movie.getName().equals(movieName))
                .map(movie -> movie.isAvailable())
                .findFirst().orElse(false);                                
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

}
