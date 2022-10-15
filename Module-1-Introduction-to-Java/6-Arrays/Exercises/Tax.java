import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */
        double[] afterTax = new double[4];
         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */
        int i;
        for( i=0; i<afterTax.length; i++){
            afterTax[i] = price[i] * 1.13;
        }

        
         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */

        for(int j=0;j<2;j++){
            if(j==0){
                System.out.print("The original prices are: ");
                for(i=0; i<price.length; i++){
                    System.out.print(price[i]+" ");
                }
                System.out.print("\n");

            }else{
                System.out.print("The prices after tax are: ");
                for(i=0; i<afterTax.length; i++){
                    System.out.print(afterTax[i]+" ");
                }
                System.out.print("\n");
            }
        }


    }
}
