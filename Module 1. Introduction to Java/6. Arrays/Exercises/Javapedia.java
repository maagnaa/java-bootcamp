import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        System.out.println("How many historical figures will you register?");
        int entriesRequested = scan.nextInt();
        scan.nextLine();

        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String[][] database = new String[entriesRequested][3];

        
        //Watch out for the nextLine() pitfall. 
        for (int i=0; i<database.length;i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");

        }
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(database);

        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        System.out.print("\nWho do you want information on? ");  
        String nameRequest = scan.nextLine();

        for(int j=0;j<database.length;j++){
            if(database[j][0].equalsIgnoreCase(nameRequest)){
                System.out.println("\t"+database[j][0]);
                System.out.println("\t"+database[j][1]);
                System.out.println("\t"+database[j][2]);

            }
        }



        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

    public static void print2DArray(String[][] array){
        for(int i=0;i<array.length;i++){            // Loop through rows
            if(i<10){
                System.out.print("ROW  "+i+".  ");

            }else{
                System.out.print("ROW "+i+".  ");
            }
            
            for(int j=0;j<array[i].length;j++){     // Loop through columns
                System.out.print("\t"+array[i][j]+" ");
                if(j==(array[i].length)){
                    System.out.print("\n");
                }
            }
            System.out.print("\n");

        }
     }

}
