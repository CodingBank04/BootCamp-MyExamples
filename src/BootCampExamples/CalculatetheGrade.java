package BootCampExamples;
import java.util.Scanner;
public class CalculatetheGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float score1;
        float score2;
        float score3;
        System.out.println("Please enter the first score:");
        score1 = input.nextFloat();
        System.out.println("Please enter the second score:");
        score2 = input.nextFloat();
        System.out.println("Please enter the third score:");
        score3 = input.nextFloat();
        float average;
        average = (score1 + score2 + score3) / 3;
        if (average<=0 && average <= 49) {
            System.out.println("The average score is F : " + average);
        }
        else if(average>=50 && average<=59){
            System.out.println("The average score is D : " + average);
        }
        else if(average>=60 && average<=69){
            System.out.println("The average score is C  : " + average);

    }
        else if(average>=70 && average<=79){
            System.out.println("The average score is B  : " + average);

}
        else if(average>=80 && average<=89) {
            System.out.println("The average score is A : " + average);

        }
        else if(average>=90 && average<=100){
            System.out.println("The average score is A+ : " + average);

        }
        else{
            System.out.println("Not between 0-100(invalid)");
        }
    }}