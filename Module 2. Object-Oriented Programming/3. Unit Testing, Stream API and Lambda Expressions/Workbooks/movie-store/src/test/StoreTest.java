package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Movie;
import src.main.models.Store;

public class StoreTest {

    Store store;
    String movieName1 = "The Shawshank Redemption";
    String movieName2 = "The Godfather";
    String movieName3 = "The Lord of The Rings: The Fellowship of the Ring";

    @Before                     // Method that runs before each test
    public void setup(){
        store = new Store();
        store.addMovie(new Movie(movieName1, "Blue-Ray", 9.2));
        store.addMovie(new Movie(movieName2, "Blue-Ray", 9.1));
    }

    @Test
    public void checkAddMovie(){
        assertTrue(store.contains(new Movie(movieName2, "Blue-Ray", 9.1)));
    }

    @Test
    public void sellMovieTest(){
        store.sellMovie(movieName2);
        assertFalse(store.movieExists(movieName2));
    }

    @Test
    public void rentMovieTest(){
        store.rentMovie(movieName1);
        assertFalse(store.movieIsAvailable(movieName1));
    }

    @Test
    public void returnMovieTest(){
        store.rentMovie(movieName1);
        store.returnMovie(movieName1);
        assertTrue(store.movieIsAvailable(movieName1));
    }

    @Test(expected = IllegalStateException.class)
    public void movieNotInStock(){
        store.rentMovie(movieName2);
        store.sellMovie(movieName2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movieNotInRecord(){
        store.sellMovie(movieName3);
    }
}
