package BootCampExamples;
import java.util.Scanner;
public class ComputerScienceSkill {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your computer skill(JAVA(J),SQL(S) and CLOUD(C):");

        String skill = user.next();

        if(skill.equals("J")){
            System.out.println("Please enter your QA Java score (0-100)");
            int score =user.nextInt();
            if(score>=0 && score<=100){
            }
            else
                System.out.println("N/A");
            }

         else if (skill.equals("S")) {
             System.out.println("Please enter your Hackerrank score ");
             int score=user.nextInt();
         }
         else if(skill.equals("C")) {
             System.out.println("Do you have any Cloud Certificate: Choose(Y/N)");
                skill = user.next();

        }

        else{
            System.out.println("Invalid Entry");
        }

    }
}
