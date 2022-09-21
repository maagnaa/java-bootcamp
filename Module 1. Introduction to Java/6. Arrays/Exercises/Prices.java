public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},  // Row 1 -  Baking
            {0.99, 1.99, 2.49, 1.49, 2.99},     // Row 2 -  Beverages
            {.99, 7.99, 9.49, 9.99, 10.99},     // Row 3 -  Cereals
        };
        // Task 2 - Populate your 2D array with values from the table (see article)

        // Task 3 - Print the prices for each department. See the article for the expected output.  
        for (int i=0; i<prices.length; i++){                            // Loop through the rows
            switch (i) {
                case 0: System.out.print("Baking: \t"); break;        
                case 1: System.out.print("Beverage: \t"); break;
                case 2: System.out.print("Cereals: \t"); break;
            }
            for(int j=0; j<prices[i].length; j++){ //Loop through the columns
                System.out.print(prices[i][j] + " ");
                if(j==(prices[i].length-1)){
                    System.out.print("\n");
                }
            }
        }

    }
}