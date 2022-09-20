public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon, evening, midnight);
        
    }


    //Task 1: Make a function here. See the doc comments below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     public static double fahrenheitToCelsius(double tempFahrenheit){
        double tempCelsius = (tempFahrenheit - 32)*5/9; 
        return tempCelsius;
     }
     
    //Task 2: Make a function here. See the doc comments below. 

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */

     public static void printTemperatures(double noonTempF, double eveningTempF, double midnightTempF){
        double noonTempC = fahrenheitToCelsius(noonTempF);
        double eveningTempC = fahrenheitToCelsius(eveningTempF);
        double midnightTempC = fahrenheitToCelsius(eveningTempF);

        System.out.println("\nNoon Temperature"
                            +"\nIn Fahrenheit: " + noonTempF  
                            +"\nIn Celcius: " + noonTempC
                            +"\n\nEvening Temperature"
                            +"\nIn Fahrenheit " + eveningTempF
                            +"\nIn Celcius" + eveningTempC
                            +"\n\nMidnight Temperature"
                            +"\nIn Fahrenheit " + midnightTempF
                            +"\nIn Celcius" + midnightTempC);
     }

}
