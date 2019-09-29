package SelfStudy;

import java.awt.*;
import java.sql.Array;
import java.sql.Date;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

       /* Point point1= new Point(1,1);
        Point point2=point1;
        point1.x=2;
        System.out.println(point2);
        System.out.println(point1);*

        */


       /* Date now= new Date(9/9/2018);
        now.setTime(9/9/2019);
        System.out.println(now);*/

         //String message = new String("HELLO WORLD");
          //System.out.println(message);

        //String message = "Hello World " + "!!";
       // System.out.println(message.toLowerCase());

        //String message = "Hello World " + "!!";
       // System.out.println(message.startsWith("!!"));

        //String message = "Hello World " + "!!";
        //System.out.println(message.length());

        //String message = "Hello World " + "!!";
        //System.out.println(message.indexOf("e"));

        /*String message = "Hello World " + "!!";
        System.out.println(message.replace("!","*"));
        System.out.println(message); //original string remain the same.
        System.out.println(message.toUpperCase());

         */
       /* String message = "   Hello World " + "!!   ";
        System.out.println(message);
        System.out.println(message.trim());
        */

        //String message = "   Hello \"World|\" " + "!!   ";
       // System.out.println(message);

        /*int[] numbers= new int[5];
        numbers[0]=1;
        numbers[1]=2;
       // Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

         */

       /* int[] numbers={2,3,5,6,8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        */
       int[][] numbers =new int[2][3];
       numbers[0][0]=1;
        System.out.println(Arrays.deepToString(numbers));




    }
}
