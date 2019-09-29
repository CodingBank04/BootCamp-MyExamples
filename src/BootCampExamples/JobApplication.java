package BootCampExamples;
/*Question : Suppose that a job board software analyzes resumes and extracts certain values given below:
        Java : possible values : entry,junior,senior
        SQL : possible values : 100, 200, 300
        Experience possible values : 1,2,3,4,5,6,7,8,9,10
        According to those values calculate candidate’s score. Calculation:
        Score = (Java (entry) 500 + SQL value ) * experience
        Score = (Java (junior) 1000 + SQL value) * experience
        Score = (Java (Senior)2000 + SQL value) * experience
        According to score give result. Calculation:
        Score > 10.000  offer $80.000
        Score between 7.000 – 10.000 offer $60.000
        Score between 5.000 - 7.000 offer $40.000
        Below 5.000 print we will keep your resume

 */
import java.util.Scanner;
public class JobApplication {
    public static void main(String[] args){
        System.out.println("Enter your JAVA level:");
        Scanner scan = new Scanner(System.in);
        String java = scan.nextLine();
        System.out.println("Enter your SQL score:");
        int sql = scan.nextInt();
        System.out.println("Enter your experience:");
        int exp = scan.nextInt();
        job(java, sql, exp);
    }
    public static void job(String java, int sqlScore, int experience){
        int score = 0;
        if(java.equalsIgnoreCase("entry")){
            score = (500 + sqlScore) * experience;
        }
        if(java.equalsIgnoreCase("junior")){
            score = (1000 + sqlScore) * experience;
        }
        if(java.equalsIgnoreCase("senior")){
            score = (2000 + sqlScore) * experience;
        }
        if(score > 10000){
            System.out.println("We will offer $80.000");
        }
        else if(score >= 7000 && score < 10000){
            System.out.println("We will offer $60.000");
        }
        else if(score >= 5000 && score < 7000){
            System.out.println("We will offer $40.000");
        }
        else
            System.out.println("We will keep your resume for future.");
    }
}

