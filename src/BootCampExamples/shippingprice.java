package BootCampExamples;
import java.util.Scanner;
public class shippingprice {
    public static void main(String[] args) {
        int wPoint = 0;
        int vPoint = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter weight: ");
        int weight = input.nextInt();

        if (weight > 1 && weight <= 5) {
            wPoint = 12;
        } else if (weight >= 6 && weight <= 12) {
            wPoint = 29;
        } else {
            wPoint = 50;
        }

        System.out.println("enter volume: ");
        int volume = input.nextInt();

        if (volume >= 5 && volume <= 10) {
            vPoint = 20;
        } else if (volume > 10 && volume < 21) {
            vPoint = 45;
        }

        System.out.println("enter distance: ");
        int distance = input.nextInt();

        double priceGround = (wPoint * vPoint / 11 * distance / 100);
        double priceUrgent = (wPoint * vPoint / 5 * distance / 100);
        System.out.printf(" Ground Price is $%.2f\n", priceGround);
        System.out.printf(" Urgent Price is $%.2f", priceUrgent);
    }
}