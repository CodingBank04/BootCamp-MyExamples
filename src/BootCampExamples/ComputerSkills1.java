package BootCampExamples;

import java.util.Scanner;

public class ComputerSkills1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your skill? Java/SQL/Cloud");
        String skill =scanner.next();

        if(skill.equalsIgnoreCase("Java")) {
            System.out.print("QA score ");
            int qascore=scanner.nextInt();
            if(qascore>=80){
                System.out.println("Accepted");
            }
            else{
                System.out.println(("Not Accepted"));
            }
        }
        else if(skill.equalsIgnoreCase("SQL")){
            System.out.println("Hackerrank Score");
            int hrscore=scanner.nextInt();
            if(hrscore>=400){
                System.out.println("Good");

            }
            else if(hrscore>300 && hrscore<400){
                System.out.println("Not bad");

            }
            else{
                System.out.println("No Comment");
            }

        }
        else {
            System.out.print("Certification");
            String cert=scanner.next();
            if(cert.equals("Y")||cert.equalsIgnoreCase("yes")){
                System.out.println("Good JOB");
        }
            else{
                System.out.println("Thats Fine");
            }
        }}}
