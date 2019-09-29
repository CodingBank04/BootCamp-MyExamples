package Inheritance;

public class ArraysTest
{
    public static void main(String[] args) {
        Arrays myArr= new Arrays();
        int[] param={1,2,3,4,5,6,7,8,9};
        System.out.println(myArr.returnIndex(param,5));

        StatArrays myStat= new StatArrays();
        System.out.println(myStat.returnAverage(param));




    }
}
