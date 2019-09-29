package BootCampExamples;
import java.util.Scanner;
public class breakandcontinue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int number=scanner.nextInt();
            if(number==-1){
                System.out.println("Exit from loop....");
                break;
            }
            System.out.println("number:" + number);
        }

    }
}
