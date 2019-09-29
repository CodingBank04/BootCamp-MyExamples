import java.sql.SQLOutput;
import java.util.Scanner;
public class exampletest {
    public static void main(String[] args) {
        Scanner forecast = new Scanner(System.in);
        System.out.println("Please enter day, description, precipitation, wind direction, wind speed , humidity : ");
        String day1 = forecast.next();
        String descrp1 = forecast.next();
        int precip1 = forecast.nextInt();
        String windDir1 = forecast.next();
        int wind1 = forecast.nextInt();
        int humid1 = forecast.nextInt();
        System.out.println("Please enter day, description, precipitation, wind direction, wind speed, humidity : ");
        String day2 = forecast.next();
        String descrp2 = forecast.next();
        int precip2 = forecast.nextInt();
        String windDir2 = forecast.next();
        int wind2 = forecast.nextInt();
        int humid2 = forecast.nextInt();
        System.out.println("Please enter day, description, precipitation, wind direction, wind speed, humidity : ");
        String day3 = forecast.next();
        String descrp3 = forecast.next();
        int precip3 = forecast.nextInt();
        String windDir3 = forecast.next();
        int wind3 = forecast.nextInt();
        int humid3 = forecast.nextInt();
        System.out.println("Please enter day, description, precipitation,wind direction, wind speed, humidity : ");
        String day4 = forecast.next();
        String descrp4 = forecast.next();
        int precip4 = forecast.nextInt();
        String windDir4 = forecast.next();
        int wind4 = forecast.nextInt();
        int humid4 = forecast.nextInt();
        System.out.println("Please enter day, description, precipitation,wind direction, wind speed, humidity : ");
        String day5= forecast.next();
        String descrp5 = forecast.next();
        int precip5 = forecast.nextInt();
        String windDir5 = forecast.next();
        int wind5 = forecast.nextInt();
        int humid5 = forecast.nextInt();
        System.out.println("5 day forecast: ");
        forecast.nextLine();
        System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", day1,descrp1,precip1, wind1, windDir1, humid1);
        forecast.nextLine();
        System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", day2,descrp2,precip2, wind2, windDir2, humid2);
        forecast.nextLine();
        System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", day3,descrp3,precip3, wind3, windDir3, humid3);
        forecast.nextLine();
        System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", day4,descrp4,precip4, wind4, windDir4, humid4);
        //forecast.nextLine();
        //System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", day5,descrp5,precip5, wind5, windDir5, humid5);
       // System.out.println("5 day forecast: ");
        //forecast.nextLine();
       // System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", jun28,dcrptn1,pptn1, winddir1, windspd1, hmdty1);
        //forecast.nextLine();
        //System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", jun29,dcrptn2,pptn2, winddir2, windspd2, hmdty2);



    }




}




