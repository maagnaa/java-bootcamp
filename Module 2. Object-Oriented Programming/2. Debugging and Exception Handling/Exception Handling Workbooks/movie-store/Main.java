import models.Movie;
import models.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        
        Movie lotr1 = new Movie("The Lord of The Rings: The Fellowship of the Ring","DVD",5);
        Movie lotr2 = new Movie("The Lord of The Rings: The Two Towers","DVD",5);
        Movie lotr3 = new Movie("The Lord of The Rings: The Return of the King","DVD",5);


        Store movieStore = new Store();
        movieStore.addMovie(lotr1);
        movieStore.addMovie(lotr2);
        movieStore.addMovie(lotr3);

        System.out.print("\n\n");
        System.out.print("\n\n");

        System.out.print(movieStore);

        movieStore.action(lotr1.getName(), "rent");
        System.out.print(movieStore);

        movieStore.action(lotr1.getName(), "return");
        System.out.print(movieStore);


    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */


    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */

}
