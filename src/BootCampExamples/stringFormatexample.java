import java.util.Scanner;

public class stringFormatexample {
    public static void main(String[] args){
        Scanner userWeatherInfo = new Scanner(System.in);

        System.out.println("Please enter daily data:\nDay1, Description, Precipitation, Wind Direction with speed, and Humidity ");
        String day1 = userWeatherInfo.next();
        String description1 = userWeatherInfo.next();
        int precip1 = userWeatherInfo.nextInt();
        String wind1 = userWeatherInfo.next();
        int humidity1 = userWeatherInfo.nextInt();

        System.out.println("Please enter daily data:\nDay2, Description, Precipitation, Wind Direction with speed, and Humidity ");
        String day2 = userWeatherInfo.next();
        String description2 = userWeatherInfo.next();
        int precip2 = userWeatherInfo.nextInt();
        String wind2 = userWeatherInfo.next();
        int humidity2 = userWeatherInfo.nextInt();

        System.out.println("Please enter daily data:\nDay3, Description, Precipitation, Wind Direction with speed, and Humidity ");
        String day3 = userWeatherInfo.next();
        String description3 = userWeatherInfo.next();
        int precip3 = userWeatherInfo.nextInt();
        String wind3 = userWeatherInfo.next();
        int humidity3 = userWeatherInfo.nextInt();

        System.out.println("Please enter daily data:\nDay4, Description, Precipitation, Wind Direction with speed, and Humidity ");
        String day4 = userWeatherInfo.next();
        String description4 = userWeatherInfo.next();
        int precip4 = userWeatherInfo.nextInt();
        String wind4 = userWeatherInfo.next();
        int humidity4 = userWeatherInfo.nextInt();

        System.out.println("Please enter daily data:\nDay5, Description, Precipitation, Wind Direction with speed, and Humidity ");
        String day5 = userWeatherInfo.next();
        String description5 = userWeatherInfo.next();
        int precip5 = userWeatherInfo.nextInt();
        String wind5 = userWeatherInfo.next();
        int humidity5 = userWeatherInfo.nextInt();

        System.out.println("\n********************* 5 Days Forecast *******************\n");
        System.out.println("Day\t  Description\t\t    Precip\t Wind\t     Humidity");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-13s %10d%% %10s mph %8d%%\n", day1, description1, precip1, wind1, humidity1);
        System.out.printf("%-5s %-13s %10d%% %10s mph %8d%%\n", day2, description2, precip2, wind2, humidity2);
        System.out.printf("%-5s %-13s %10d%% %10s mph %8d%%\n", day3, description3, precip3, wind3, humidity3);
        System.out.printf("%-5s %-13s %10d%% %10s mph %8d%%\n", day4, description4, precip4, wind4, humidity4);
        System.out.printf("%-5s %-13s %10d%% %10s mph %8d%%\n", day5, description5, precip5, wind5, humidity5);

    }

}
