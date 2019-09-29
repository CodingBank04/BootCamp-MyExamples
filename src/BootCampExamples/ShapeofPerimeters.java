package BootCampExamples;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class ShapeofPerimeters {
    public static void main(String[] args){
        Scanner scanParameter = new Scanner(System.in);
        System.out.print("C for circle , R for Rectangle , T for Triangle");
        String shape =scanParameter.next();
        double perimeter=0;

        if(shape.equals("C")){
            System.out.print("Please enter radius:");
            int radius = scanParameter.nextInt();
            perimeter = 2*3.14*radius;

        }
        else if (shape.equals("R")){
            System.out.print("Please width");
            int width = scanParameter.nextInt();
            System.out.print("Please height");
            int height = scanParameter.nextInt();
            perimeter= 2 * (width + height);

    }
        else if (shape.equals("T")){
            System.out.print("side1:");
            int side1 =scanParameter.nextInt();
            System.out.print("side2:");
            int side2 =scanParameter.nextInt();
            System.out.print("side3:");
            int side3 =scanParameter.nextInt();
            perimeter= side1+side2+side3;



        }

        else{
            System.out.println("Please enter C , R or T");
        }
        System.out.println("Perimeter is: %.3f" + perimeter);

    }
}
