public class Championship {
    public static void main(String[] args) {

        int gryffindor = 600;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if  (margin > 0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }


        
        gryffindor = 400;    //gryffindor points
        ravenclaw = 200;    //ravenclaw points

        margin = gryffindor - ravenclaw;

        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if  (margin > 0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

        
        gryffindor = 450;    //gryffindor points
        ravenclaw = 500;    //ravenclaw points
        margin = gryffindor - ravenclaw;


        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if  (margin > 0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

        gryffindor = 100;    //gryffindor points
        ravenclaw = 500;    //ravenclaw points
        margin = gryffindor - ravenclaw;


        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if  (margin > 0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

    }
}