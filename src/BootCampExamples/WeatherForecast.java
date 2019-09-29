package BootCampExamples;
import java.util.Scanner;
public class WeatherForecast {
    public static void main(String[] args){
        Scanner forecast = new Scanner(System.in);
        System.out.println("WEATHER FORECAST FOR THE FOLLOWING DAYS!");
        System.out.println("Please enter following information to below table(Day,Description,Precipitation , Wind Direction, Wind Speed,Humidity)");

        System.out.print("Jun28th: ");
        String jun28 = forecast.next();
        System.out.print("Description : ");
        String dcrptn1 = forecast.next();
        System.out.print("Precipitation(%): ");
        int pptn1 = forecast.nextInt();
        System.out.print("Wind Direction: ");
        String winddir1 = forecast.next();
        System.out.print("Wind Speed (mph):  ");
        int windspd1 =forecast.nextInt();
        System.out.print("Humidity (%):" );
        int hmdty1  = forecast.nextInt();

        System.out.print("Jun29th: ");
        String jun29 = forecast.next();
        System.out.print("Description : ");
        String dcrptn2 = forecast.next();
        System.out.print("Precipitation(%): ");
        int pptn2 = forecast.nextInt();
        System.out.print("Wind Direction: ");
        String winddir2 = forecast.next();
        System.out.print("Wind Speed (mph):  ");
        int windspd2 =forecast.nextInt();
        System.out.print("Humidity (%):" );
        int hmdty2  = forecast.nextInt();

        System.out.print("Jun30th: ");
        String jun30 = forecast.next();
        System.out.print("Description : ");
        String dcrptn3 = forecast.next();
        System.out.print("Precipitation(%): ");
        int pptn3 = forecast.nextInt();
        System.out.print("Wind Direction: ");
        String winddir3 = forecast.next();
        System.out.print("Wind Speed (mph):  ");
        int windspd3 =forecast.nextInt();
        System.out.print("Humidity (%):" );
        int hmdty3  = forecast.nextInt();





       // System.out.println("5 day forecast: ");
        //forecast.nextLine();
        //System.out.println("5 day forecast: ");
       // forecast.nextLine();
        //System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", jun28,dcrptn1,pptn1, winddir1, windspd1, hmdty1);
       // forecast.nextLine();
        //System.out.printf("%-5s"+"%-20s"+"%10d%%"+"%10d mph"+"%10s"+"%10d%%", jun29,dcrptn2,pptn2, winddir2, windspd2, hmdty2);

    }}
