package BootCampExamples;
public class OutputQuestionHW {
    public static void main(String[] args) {

        int a= 10;
        float b =2.5f;
        String c = "10";
        String d = "Ten";

        if(a>b && c==d)
            System.out.println("This is if");

        else if(c!=d || !(b>a))
            System.out.println("This is else if ");

        else
            System.out.println("This is else");


}}
