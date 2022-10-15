/* You can only apply for a mortgage if you're over 18 and have a good credit score (debt = 0). 
* The user is 24 and carries a debt of 4000. Yet, the code outputs:
* >>﻿: We're processing your application
*/

public class Conditionals {
    public static void main(String[] args) {

        int age = 24;
        double debt = 4000;

        String creditScore = (debt > 0) ? "Bad" : "Good";
        boolean canApply = age > 18;

        if (canApply && creditScore.equals("Good")) {
            System.out.println("We're processing your application");
        } else {
            System.out.println("You cannot apply");
        }

    }
}
