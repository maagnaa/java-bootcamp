public class Calendar {
    public static void main(String[] args) {
        String day = "Tuesday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check calendar here:

            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 

        
        if (day.equals("Monday")){
            System.out.println("Sorry, I have to stay at work late.");
        }else if (day.equals("Tuesday")){
            System.out.println("It looks like I have meetings all day.");
        }else if (day.equals("Wednesday")){
            System.out.println("I have a dentist appointment. Some other time!");
        }else if (day.equals("Thursday")){
            System.out.println("Sorry, thursday is date night!");
        }else if (day.equals("Friday")){
            System.out.println("I'm free!!");
        }else if (day.equals("Saturday")){
            System.out.println("I'm free!!");
        }else if (day.equals("Sunday")){
            System.out.println("I'm free!!");
        }else{
            System.out.println("that's not a day.");
        }




    }
}