package BootCampExamples;

public class StringComparsion {
    public static void main(String[]args){
        String check1 ="zz";
        String check2= "aa";
        System.out.println(check1.compareTo(check2));
        if(check1.compareTo(check2)==0){
            System.out.println("they are equal");
        }
    }
}
