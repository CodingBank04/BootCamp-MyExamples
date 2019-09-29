package BootCampExamples;
import java.util.Scanner;
public class JobResume {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jlevelvalue=0;
        int sqlvalue =0;

        System.out.println("Please enter possible values for JAVA(ENTRY,JUNIOR,SENIOR)");
        String jLevel = input.next();

        if(jLevel.equals("entry") || jLevel.equals("junior")||jLevel.equals("senior")){
            System.out.println("Your level is  "+jLevel);
        }
        else  {
            System.out.println("Please enter correct level value");

        }
        if (jLevel.equals("entry")){
            jlevelvalue=500;

        }
        else if (jLevel.equals("junior")){
            jlevelvalue =1000;

        }
        else{
            jlevelvalue= 2000;
        }


        System.out.println("Please enter following SQL values (100,200,300) ");
        String sqlValue = input.next();
        if(sqlValue.equals("100") || sqlValue.equals("200")||sqlValue.equals("300")){

            System.out.println("SQl Values is : "+sqlValue);

        }
        else{
            System.out.println(" Please enter given SQL value");
        }

        if(sqlValue.equals("100")){
            sqlvalue= 100;

        }
        else if (sqlValue.equals("200")){
            sqlvalue =200;

        }
        else{
            sqlvalue =300;

        }
        System.out.println("Please enter following experince values (1,2,3,4,5,6,7,8,9,10)");
        int ExValue =input.nextInt();

        double score = (jlevelvalue + sqlvalue)*ExValue;
        System.out.println("Based on following information your score is:" + score);

        if( score>10000){
            System.out.println("Offering %80000");


        }
        else if(score>=7000){
            System.out.println("Offering $60000");
        }
        else if(score>=5000){
            System.out.println("Offering $40000");
        }
        else {
            System.out.println("We will keep your resume");
        }







    }

}
