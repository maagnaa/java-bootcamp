public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19. 
        
        /* Task 2
             
            1. If the number is even, print ' – even' beside the number.
            2. If the number is odd, print ' – odd' beside the number.

         */

         for(int i=0; i<20; i++){
            if(i%2==0){
                System.out.println(i+". - Even Number");
            }else{
                System.out.println(i+". - Odd Number");
            }
            // Wait a little between printing out each number so it feels more interactive
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}
         }

    }
}
