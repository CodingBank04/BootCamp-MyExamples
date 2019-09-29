package com.testing;
import java.util.Scanner;
public class InternetBill {
    public static void main(String[] args) {
        Scanner internet = new Scanner(System.in);
        System.out.print("Subscribed? Y/N");
        String subscription = internet.next();
        if(subscription.equals("Y")){
            System.out.print("Usage?");
            int usage = internet.nextInt();
            if(usage<=100) {
                System.out.println("$10");
            }
            else {
                System.out.println("$40");
            }
        }
        else if (subscription.equals("N")){
            System.out.println("Please visit subscription page");
        }
        else {
            System.out.println("Please enter Y or N");
        }
    }
}




