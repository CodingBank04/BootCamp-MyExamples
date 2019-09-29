package BootCampExamples;
import java.util.Scanner;
public class NumbertoString {
    public static void main(String[] args){
        System.out.println("Please enter a valid number:" );

        int number =0;
        Scanner scanner = new Scanner(System.in);
        number =scanner.nextInt();

        if(number==0){
            System.out.print("Number in words: ZERO");

        }
        else if (number==1){
            System.out.print("Number in words: ONE");

        }
        else{
            System.out.print("Number in words:"+ (number));
        }

    }





}