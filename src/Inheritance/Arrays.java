package Inheritance;

public class Arrays {
    public int returnIndex(int [] array, int element){
        int found=0;
        for (int i=0; i<array.length; i++){
            if (element==array[i]){
                found=i;

            }

        }
        return found;
    }
    public int returnIndex(String []array, String element){
        int index=0;
        int found =0;
        for (String oneElement:array){
            if (oneElement.equals(element)) {

                found=index;
            }

        }
        return found;
    }}
