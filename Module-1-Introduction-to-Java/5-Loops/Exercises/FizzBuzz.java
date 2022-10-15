public class FizzBuzz {
    public static void main(String[] args) {

       // Task 1 – Make a for loop that counts from 0 to 18. 
       
       /* Task 2
             
            Beside each number:
                 if it's a multiple of three, mark it as Fizz.
                 if it's a multiple of five, mark it as Buzz.
                 if it's a multiple of three and five, mark it as FizzBuzz. 

         */

        /* Hints:
            If a number is a multiple of X, the remainder is zero when you divide that number by X. 
            There are three conditions for Fizz, Buzz, and FizzBuzz. Be careful about their order. If something is FizzBuzz, it can also be Fizz or Buzz. 
        */

        for(int i=0; i<19; i++){

            String iF;

            if(i<10){
                iF = " "+i; 
            }else{
                iF = String.valueOf(i);
            }

            if((i%3==0) && (i%5==0)){
                System.out.println(iF+". -->> FizzBuzz <<-- ");
            }else if(i%3==0){
                System.out.println(iF+". --->   Fizz   <---");
            }else if(i%5==0){
                System.out.println(iF+". --->   Buzz   <---");
            }/*else{
                System.out.println(iF+". ");
            }*/

            // Wait a little between printing out each number so it feels more interactive
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}
        }

    }

}
