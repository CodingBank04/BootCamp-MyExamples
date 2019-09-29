package BootCampExamples;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year=scanner.nextInt();

        if(year %400==0){
            System.out.println("True");
        }
        else if(year %100==0){
            System.out.println("False");
        }
        else if(year %4==0){
            System.out.println("True");

        }


        }
    }

