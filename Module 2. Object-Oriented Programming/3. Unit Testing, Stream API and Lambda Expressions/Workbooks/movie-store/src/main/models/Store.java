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
        if(!(movieIsAvailable(name))){
            throw new IllegalStateException("Cannot sell a movie that is not available");
        }

        this.movies.removeIf(movie -> movie.getName().equals(name));

    }


    public boolean movieExists(String movieName){
        return this.movies.stream().anyMatch(movie -> movie.getName().equals(movieName));
    }

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
