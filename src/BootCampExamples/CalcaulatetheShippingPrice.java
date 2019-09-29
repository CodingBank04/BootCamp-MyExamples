package BootCampExamples;
import java.util.Scanner;
public class CalcaulatetheShippingPrice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the length of your package :   ");

        double length = input.nextDouble();

        System.out.println("Please enter the width of your package:   ");

        double width = input.nextDouble();

        System.out.println("Please enter the height of your package:   ");

        double height = input.nextDouble();



        double volume = length * width * height;

        System.out.println("The total volume of your package is:  " + volume);
        System.out.println("Please enter package weight:");
        double weight =input.nextDouble();
        System.out.println("The total weight of your package is;" + weight);
        int distance=input.nextInt();

         double priceGround=input.nextDouble();
        System.out.println("Price Ground of your package is: $" + priceGround);
        double priceUrgent=input.nextDouble();
        System.out.println("Price Urgent of your package is: $" + priceUrgent);

    }
}