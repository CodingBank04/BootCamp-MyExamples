package BootCampExamples;

public class ElectricBill {
    public static void main(String[] args){
        int amountKw = 800;
        double bill= 0;
        //double bill;
//alwways give the initial value its good start with 0
        if(amountKw>0 && amountKw <=500){
            bill = amountKw * 0.3;
        }
        else if(amountKw>500 && amountKw<=1000){
            bill=amountKw *0.4;
            /// bu sarti sagliyor digerleri iptal.

        }
        else if(amountKw>1000 && amountKw<=2000){
            bill= amountKw * 0.5;
        }
        else{
            bill =amountKw * 0.8;
        }
        System.out.println("your bill is;" + bill);
    }
}
