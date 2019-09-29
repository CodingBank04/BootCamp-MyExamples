package BootCampExamples;

public class AgeExample {
    public static void main(String[]args){
        int age =40;

        if( age>0 && age<=15){
            System.out.println("Child");
        }
        else if(age>15 && age<31){
            System.out.println("Young");
        }

        else {
            System.out.println("Adult");
        }
    }
}
