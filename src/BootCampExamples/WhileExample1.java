package BootCampExamples;

public class WhileExample1 {
    public static void main(String[] args) {

        int i = 20;

        while (i <= 150) {
            if (i % 4 == 0) {
                System.out.print(i);
                System.out.print("-");
            }
            i++;

        }
        System.out.println("\b");
    }

}
