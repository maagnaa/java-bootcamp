public class WorkSchedule {
    public static void main(String[] args) {
        int day = 61;   //3rd day of the week...
        boolean holiday = false;
        //boolean holiday = true;
         
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";

        if(holiday == true){
            System.out.println("woohoo, no work!");
        }else if(day>5){
            System.out.println("it's the weekend, no work!");
        }else{
            System.out.println("Wake up at 7:00 :( ");
        }


    }
}
