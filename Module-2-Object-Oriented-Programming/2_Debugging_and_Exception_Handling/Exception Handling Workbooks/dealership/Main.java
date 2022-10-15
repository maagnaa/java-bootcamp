import java.util.Scanner;

import models.Car;
import models.Dealership;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Honda", 10000),
            new Car("Volvo", 12000),
        };
        cars[1].setMake("Alfa Romeo");
        cars[1].setPrice(18500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            System.out.print("Enter the spot number of the car you want to buy: "); 
            int spot = scan.nextInt();
            dealership.sell(spot);    

            if (dealership.isEmpty()){
                System.out.print("The dealership is now empty!"); 

                break;
            }
        }

       //scan.close();

    }
}
