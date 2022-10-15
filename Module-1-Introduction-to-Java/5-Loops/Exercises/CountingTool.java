import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*Task 1 – Choose a number

            Ask: Hi Timmy! Choose a number to count to: 

            Make sure Timmy can enter the value BESIDE the question. 
        */

        System.out.println("Hi Timmy! Choose a number to count to:");
        int targetNumber = scan.nextInt();
        System.out.println("Okay Timmy! I will count to: " + targetNumber + "\n");


        /* Task 2 – Count from 0 to that number

             Let's say Timmy entered 5, you would display: 0 1 2 3 4 5 

        */
        for(int i=0;i<=targetNumber;i++){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }    
            System.out.print(i+" ");
        }


        scan.close();
    }
}
