package BootCampExamples;
import java.util.Scanner;
public class carpurchaseswitch {
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter you model choice");
        String choice=read.next();
        int choiceNumber=0;
        if(choice.equals("x")){
            System.out.println("you select x model");
            System.out.println("do you want body package?yes/no");
            String body=read.next();
            System.out.println("do you want sound package?yes/no");
            String sound=read.next();
            int finalPriceX=0;
            switch(body.equals("yes")&& sound.equals("yes")?0:body.equals("yes")&& sound.equals("no")?1:
                    body.equals("no")&& sound.equals("yes")?2:body.equals("no")&& sound.equals("no")?3:4){
                case 0:
                    finalPriceX=30000+5000+3000;
                    System.out.println(finalPriceX);
                    break;
                case 1:
                    finalPriceX=30000+5000;
                    System.out.println(finalPriceX);
                    break;
                case 2:
                    finalPriceX=30000+3000;
                    System.out.println(finalPriceX);
                    break;
                case 3:
                    finalPriceX=30000;
                    System.out.println(finalPriceX);
                    break;
                default:
                    System.out.println("error");
                    break;

            }
        }
        else if(choice.equals("y")){
            System.out.println("you select y model");
            System.out.println("do you want body package?yes/no");
            String entertainment=read.next();
            System.out.println("do you want sound package?yes/no");
            String safety=read.next();
            int finalPriceY=0;
            switch(entertainment.equals("yes")&& safety.equals("yes")?0:entertainment.equals("yes")&& safety.equals("no")?1:
                    entertainment.equals("no")&& safety.equals("yes")?2:entertainment.equals("no")&& safety.equals("no")?3:4) {
                case 0:
                    finalPriceY = 35000 + 8000 + 4000;
                    System.out.println(finalPriceY);
                    break;
                case 1:
                    finalPriceY = 35000 + 8000;
                    System.out.println(finalPriceY);
                    break;
                case 2:
                    finalPriceY = 35000 + 4000;
                    System.out.println(finalPriceY);
                    break;
                case 3:
                    finalPriceY = 35000;
                    System.out.println(finalPriceY);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        else {
            System.out.println("x or y only");
        }


    }
}