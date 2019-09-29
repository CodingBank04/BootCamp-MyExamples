package BootCampExamples;

public class UdemmyPractice1 {
    public static void main(String[] args) {
        //https://unicode-table.com/en/#0168

        char a = 'A';
        char b ='?';
        char c =2000;
        char d='\u0168';


        System.out.println(d);

        boolean x = true;
        boolean y = false;
        System.out.println(x);


        String ab = "Java\tProglama\tDili";
        System.out.println(ab);

        String abc = "Java\nProglama\nDili";
        System.out.println(abc);
          /*
        + ---> Toplama Operatörü
        - ---> Çıkarma Operatörü
        / ---> Bölme Operatörü
        * ---> Çarpma Operatörü
        % ---> Kalan Operatörü

        */
        /*
        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10 / 4.0);
        System.out.println(3 * 4.5);
        System.out.println(10 % 4);
        */
        System.out.println((3f / 4) + (4 * 5));

    }


}
