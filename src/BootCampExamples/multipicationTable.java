package BootCampExamples;

public class multipicationTable {
        public static void main (String[]args){
            System.out.print("  ");
            for (int k = 1; k < 10; k++) {
                System.out.printf("%5d", k);
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
            for (int i = 1; i < 10; i++) {
                System.out.print(i + "|");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%5d", i * j);

                }
                System.out.println();
            }
        }
    }





