package BootCampExamples;
import java.util.Scanner;
public class ComputerSkills {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your skill? Java/SQL/Cloud");
        String skill =scanner.next();
        if(skill.equals("Java")) {
            System.out.print("QA score ");
        }
        else if(skill.equals("SQL")){
            System.out.println("Hackerrank Score");

        }
        else{
            System.out.println("Certification");
        }

        }
}
