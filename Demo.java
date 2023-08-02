//Deepika K J -- Assessment

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    getWeather();
                    break;
                case 2:
                    getWindSpeed();
                    break;
                case 3:
                    getPressure();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Get weather");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void getWeather() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        String weather = getWeatherFromAPI(date);
        System.out.println("Weather on " + date + ": " + weather);
    }

    private static void getWindSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        double windSpeed = getWindSpeedFromAPI(date);
        System.out.println("Wind speed on " + date + ": " + windSpeed + " mph");
    }

    private static void getPressure() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        double pressure = getPressureFromAPI(date);
        System.out.println("Pressure on " + date + ": " + pressure + " hPa");
    }

     private static String getWeatherFromAPI(String date) 
     {
        return "Sunny";
    }

    private static double getWindSpeedFromAPI(String date) 
    {
        return 8.5;
    }

    private static double getPressureFromAPI(String date)
    {
        return 1013.25;
    }
}
