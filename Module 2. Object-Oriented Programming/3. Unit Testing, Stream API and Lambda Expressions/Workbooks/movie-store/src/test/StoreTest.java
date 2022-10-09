package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Movie;
import src.main.models.Store;

public class StoreTest {

    Store store;

    @Before                     // Method that runs before each test
    public void setup(){
        store = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
    }

    @Test
    public void checkAddMovie(){
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void sellMovieTest(){
        store.sellMovie("The Godfather");
        assertFalse(store.movieExists("The Godfather"));
    }

}
