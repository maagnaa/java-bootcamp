/*
The file contains TWO functions:
    The first function should return a random number between 1 and 15.
    The second function should check if that number is prime or composite.

A prime number is not divisible by anything except itself and one (17, 29, 41...).
Common mistake: 1 is not a prime number.
 */


public class Functions {
    public static void main(String[] args) {
        int random = random(14);    
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
        double random = Math.random()*range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "PRIME";       
        
        for (int i = 2; i < random; i++) {
            if (random%i == 0){
                isPrime = "COMPOSITE";
                break;
            }
        }

        if(random == 1){
            isPrime = "NEITHER";
        }     
       
        return isPrime;
    }
}
