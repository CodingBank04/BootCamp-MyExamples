package SelfStudy;

public class ArrayLengthCheck {
    public static void main(String[] args) {
        String[] myStringArray={"may", "june","agust","october", "december"};
        int numberOfElements=0;
       //String word ="";
        for(int i=0; i<myStringArray.length; i++){
           // word=myStringArray[i];
            if(myStringArray[i].length()<4){
                numberOfElements++;
                //System.out.println(myStringArray[i]);
            }


        }
        System.out.println("There are "+numberOfElements +" String");
    }
}
