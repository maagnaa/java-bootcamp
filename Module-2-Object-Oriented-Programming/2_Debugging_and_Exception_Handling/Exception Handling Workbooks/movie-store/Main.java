
import models.Movie;
import models.Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store movieStore = new Store();
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        
        try{
            loadMovies("movies.txt");
            System.out.println("Movies Loaded");
            System.out.print(movieStore);
            manageMovies();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("\n\n Process Complete!");
        }

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
    public static void manageMovies(){
        boolean exit = false;

        while(!exit){
            String userAction = askUserAction();
            String userMovieName = "";
            switch(userAction){
                case "a":
                    System.out.println("You selected a) purchase.");
                    userMovieName = askMovieName();
                    if (!(movieStore.getMovie(userMovieName).isAvailable())) {
                        System.out.println("\n\n\n\nThe movie is not available for purchase. Please try again\n");
                        continue;
                    }
                    movieStore.action(userMovieName, "sell");
                    System.out.println("Purchase Complete");
                    break;

                case "b":
                    System.out.println("You selected b) rent.");
                    userMovieName = askMovieName();
                    movieStore.action(userMovieName, "rent");
                    System.out.println("Rental Complete");
                    break;

                case "c":
                    System.out.println("You selected c) return.");
                    userMovieName = askMovieName();
                    movieStore.action(userMovieName, "return");
                    System.out.println("Return Complete");
                    break;

                case "d":
                    System.out.println("You selected d) exit.");
                    System.out.println("Thank you for using our movie store!");
                    exit = true;
                    break;
            }

            System.out.println("The inventory of the movie store is now: \n\n"+ movieStore);
            
        }
        scan.close();
    }

    public static String askUserAction(){
        String response = "";
        while(true){
            System.out.println("What would you like to do:  \n"+
                                    "\t a) Purchase a movie.\n"+
                                    "\t b) Rent a movie.    \n"+
                                    "\t c) Return a movie.  \n"+
                                    "\t d) Exit.            \n");
            response = scan.nextLine();

            if(response.equals("a")||response.equals("b")||response.equals("c")||response.equals("d")){
                break;
            }else{
                System.out.println("That is not a valid response. Please answer 'a' 'b' 'c' or 'd");
            }
        }
        return response;
    }

    public static String askMovieName(){
        String movieName = "";
        
        while(true){
            System.out.println("Enter the name of the movie:");
            movieName = scan.nextLine();

            if(movieStore.checkMovieName(movieName)){
                break;
            }else{
                System.out.println("We dont have that movie in our inventory.");
            }
        }
        return movieName;
    }

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

     public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
            while(scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                String[] words = line.split("--");
                movieStore.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
            }
        scanFile.close();
     }

}
