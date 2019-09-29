package BootCampExamples;

public class SwitchStament1 {
    public static void main(String[] args) {
        int number=6;
        String numberString="";

        switch(number){
            case 1: numberString="one";
                break;
            case 2:numberString="tw0";
                break;
            case 3:numberString="three";
                break;
            case 4:numberString="four";
                break;
            case 5:numberString="five";
                break;
            case 6:numberString="six";
                break;
            case 7:numberString="seven";
                break;
            case 8:numberString="nine";
                break;
            case 9:numberString="ten";
                break;

            default:
                System.out.println("Invalid");
                break;


        }
        System.out.println(numberString);
    }
}
