package BootCampExamples;

public class Shipping {
    public static void main(String[] args) {
        System.out.println(calculateShipping(11.3,14.7,500,"Urgent"));

    }
    public static double calculateShipping(double weight, double volume, int distance,String gonderi){
        double price=0;
        int pointWeight=0;
        int pointVolume=0;
        if(weight>=1 && weight<=5){
            pointWeight=12;

        }
        else if(weight>=6 && weight<=12){
            pointWeight=29;

        }
        else if(weight>12){
            pointWeight=50;

        }
        else{
            System.out.println("Invalid Weight");

        }
        if(volume>=5 && volume<=10){
            pointVolume=20;

        }
        else if(volume>=11 && volume<=20){
            pointVolume=45;

        }
        else{
            System.out.println("Invalid Volume");

        }
        if(gonderi.equalsIgnoreCase("Urgent")){
            price=((pointWeight*pointVolume)/11)*distance/100;

        }
        else{
            price=((pointVolume*pointWeight)/5)*distance/100;

        }


        return price;

    }

}
