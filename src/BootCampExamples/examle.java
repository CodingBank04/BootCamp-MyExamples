package BootCampExamples;
import java.util.Scanner;
public class examle {
    public static void main(String[] args) {
        for (int i =0 ; i<101; i++){
            if(i%2==1){
                System.out.println("Odd Number"+i);
            }
            else {
                System.out.println("Even Number;"+i);
            }

        }
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter start");
        int start =scanner.nextInt();
        System.out.println("Please enter end");
        int end =scanner.nextInt();
        System.out.println("please enter step");
        for (int j=start; j<=end; j=j+5){
            System.out.println(j);
}}}
