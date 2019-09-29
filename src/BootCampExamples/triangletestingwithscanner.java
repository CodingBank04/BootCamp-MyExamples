package BootCampExamples;
import java.util.Scanner;
public class triangletestingwithscanner {
    public static void main(String[] args){
        Scanner side = new Scanner(System.in);
        System.out.println("Please enter any values below whether is triangle or not");

        System.out.println("Please enter SIDE1:");
        int side1 = side.nextInt();

        System.out.println("Please enter SIDE2:");
        int side2 = side.nextInt();

        System.out.println("Please enter SIDE3:");
        int side3 = side.nextInt();

        if(side1 + side2> side3 && side1+side3>side2 && side2+side3>side1){
            System.out.println("Triangle");
        }
        else{
            System.out.println("Not Triangle");
        }

    }
}
