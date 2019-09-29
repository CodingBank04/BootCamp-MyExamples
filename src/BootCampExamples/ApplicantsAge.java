package BootCampExamples;

public class ApplicantsAge {
    public static void main(String[] args) {
        int age = 36;
        int javaPoint = 50;
        double score=0;

        if(age>=20 && age<=30 && javaPoint>=80){
            score = age*1.5+ javaPoint *4.5;

        }
        else if (age>=20 && age<=30 && javaPoint<80){
           score  = age*1.5+ javaPoint *3.5;
        }
        else if(age>30  && javaPoint>=80){
            score= age*1.1+ javaPoint *4.5;

        }
        else if(age>30  && javaPoint<80){
            score  = age*1.1+ javaPoint *3.5;

        }
        else {
        System.out.println("your age is not acceptable for his job");
    }
        System.out.println("your score is :"+ score);

    }}