package BootCampExamples;
import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        /*
        while dongu kosulu- kosul dogru oldugu surece calisir.

         */
       // for (int i =0; i<10; i++){
           // System.out.println("i="+i);

        /*int i = 10;
        while(i<100){
            System.out.println("i="+ i);
            i+=3;

         */

       /* Scanner scanner = new Scanner(System.in );
        System.out.println("Bir sayi girinin:");
        int sayi=scanner.nextInt();
        int faktoriyel = 1;
        while(sayi>0){
            faktoriyel *= sayi;
            sayi--;


        }
        System.out.println("faktoriyel="+faktoriyel);

        */

       // program kilitleniyorsa sonsuz dongu olayir olur.
       /*int i=0;
       while (i<120){
           System.out.println("i=" + i);
       }

        */
       //1234 her bir rakamin toplamini aliyou do while dongusu
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scanner.nextInt();
        int toplam=0;
        do{
            toplam += sayi %10;
            sayi/=10; //sayi = sayi/10
            System.out.println("Sayi="+sayi);
        }
        while(sayi>10);
        System.out.println("rakamlarin toplami ="+ toplam);
    }}

