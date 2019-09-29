package BootCampExamples;

public class PurchaseDecision {
    public static void main(String[] args){

        String color= "red";
        float price = 20.99f;
        int percentage = 100;
        double score =0;

        if(color.equals("red")){
            score = price*percentage -20;


        }
        else if(color.equals("blue")) {
            score = price * percentage - 10;
        }


        if(score>=100){
            System.out.println("dont buy it");
        }
        else if(score>=50&& score<100){
            System.out.println("Buy it later");
        }
        else {
            System.out.println("But it right now");
        }


    }

}

