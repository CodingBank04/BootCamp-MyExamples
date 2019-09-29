package BootCampExamples;
import java.util.Scanner;
public class purchasecaarsystem {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.print("X or Y");
        String answer = car.next();
        if(answer.equals("X") || answer.equals("x") ){
            System.out.print("Do you want \"body\" package: (Y/N)");
            String body = car.next();
            if(body.equalsIgnoreCase("Y")){

            }
            else if(body.equalsIgnoreCase("N")){

            }
            else {
                System.out.println("Please Y or N");
            }
            System.out.print("Do yu want sound? (Y/N)");
            String sound = car.next();
            if(sound.equalsIgnoreCase("Y")){

            }
            else if(sound.equalsIgnoreCase("N")){

            }
            else {
                System.out.println("Please Y or N");
            }

        }
        else if (answer.equalsIgnoreCase("Y")){
            System.out.print("Do you want Ent. pack.? (Y/N)");
            String ent = car.next();
            if(ent.equalsIgnoreCase("Y")){

            }
            else if (ent.equalsIgnoreCase("N")){

            }
            else {
                System.out.println("Please Y or N");
            }
            System.out.print("Safety? (Y/N)");
            String safety = car.next();
            if(safety.equalsIgnoreCase("Y")){

            }
            else if(safety.equalsIgnoreCase("N")){

            }
            else {
                System.out.println("please Y or N");
            }

        }
        else {
            System.out.println("X or Y only");
        }
    }
}