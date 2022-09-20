public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = -15;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!


        if (-15 <= temp && temp <= -1){
            forecast = "The forecast is FREEZING! Stay home!";
        }else if(0 <= temp && temp <= 10){
            forecast = "The forecast is Chilly. Wear a coat!";
        }else{
            forecast = "It's warm. go outside!";
        }

        System.out.println(forecast);
    }
}
