package BootCampExamples;

public class OddorEven {
    public static void main(String[] args) {
        int number = 3435;
        int reminder = number & 2;
        if (reminder==0){
            System.out.println("Not odd number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}

