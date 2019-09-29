package BootCampExamples;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShipPrice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Please Enter Weight of Box or Object:");
        int weight =scan.nextInt();
        int wpoint;

        if( weight>=1 && weight<=5){
            wpoint= 12;
            System.out.println("Points earned:"+ wpoint); }

        else if(weight>=12 && weight<=6){
            wpoint=20;
            System.out.println("Points earned:"+ wpoint); }

        else {
            wpoint=50;
            System.out.println("Points earned:"+ wpoint); }

        System.out.print("Please Enter Volume of Object:");
        int volume =scan.nextInt();
        int vpoint;

        if(volume>=5 && volume<=10){
            vpoint=20;
            System.out.println("Points earned:"+ vpoint);}
        else if (volume>=11 && volume<=20){
            vpoint=45;
            System.out.println("Points earned:"+ vpoint);}
        else {
            System.out.println("Invalid Entry");
        }
        System.out.print("Please enter Distance(as a mile):");
        int distance=scan.nextInt();

        System.out.println("*******CALCULATION********");
        System.out.print("Please choose G fo ground and U for Urgent:");
        String urgent=scan.next();
        String ground =scan.next();

        if(ground.equalsIgnoreCase("G")){
            double pground= ((weight*volume/11))*distance/100;
            System.out.println("Price Ground is $:" + pground);
        }
        else if(urgent.equalsIgnoreCase("U")){
            double purgent= ((weight*volume/5))*distance/100;
            System.out.println("Price Urgent is $:" + purgent);
        }
        else{
            System.out.println("Invalid Entry Please Enter U or G");
        }







    }}

