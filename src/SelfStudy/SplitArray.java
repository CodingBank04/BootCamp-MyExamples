package SelfStudy;

public class SplitArray {
    public static void main(String[] args) {
        int [] myArray={1,2,3,4,5,6,7,8,9};
        int lengthArray=myArray.length;
        int halflenth=lengthArray/2;
        int index=0;

        int [] array1= new int[halflenth];
        int [] array2=new int [halflenth];

        for( int i=0; i<lengthArray; i++){
            if(i<halflenth) {
                array1[index] = myArray[index];
            }
            else{
                array2[index] = myArray[index];

            }
            index++;
            System.out.println();
        }


    }
}
