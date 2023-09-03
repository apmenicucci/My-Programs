// Write a program that allows users to convert temperatures between Celsius and Fahrenheit. 
// This program will take a temperature value and a choice of conversion
// (Celsius to Fahrenheit or vice versa) as input and provide the converted temperature as output.
// Input, basic math operations, and conditional statements

import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureConverter {
    
    public static double CtoFround(double degrees) {
        double a = 1.8;
        double b = 32.0;
        double fahrenheit = (a * degrees) + b;
        return Round(fahrenheit);
    }

    public static double FtoCround(double degrees) {
        double c = 9.0;
        double d = 5.0;
        double e = 32.0;
        double celsius = (degrees - e) * (d/c);
        return Round(celsius);
    }

    public static double CtoF(double degrees) {
        double a = 1.8;
        double b = 32.0;
        double fahrenheit = (a * degrees) + b;
        return fahrenheit;
    }

    public static double FtoC(double degrees) {
        double c = 9.0;
        double d = 5.0;
        double e = 32.0;
        double celsius = (degrees - e) * (d/c);
        return celsius;
    }

    public static void main(String[] args) {
        // Open scanner
        Scanner scanner = new Scanner(System.in);

        //Welcome messages, request for input
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("What unit are you starting with? ");
        String unit = scanner.nextLine().toUpperCase();
        System.out.print("How many degrees " + unit + " are there? ");
        double degrees = scanner.nextDouble();
        System.out.print("Would you like your conversion to be rounded? (Yes/No) ");
        String answer = scanner.next().toUpperCase();
        System.out.println("Doing the conversion...");

        if (answer.equals("YES")) {
            if (unit.equals("C") || unit.equals("CELSIUS")) {
            double rfahrenheit = CtoFround(degrees);
            System.out.print(degrees + "°C in Fahrenheit is about " + rfahrenheit + "°F.");
            } else if (unit.equals("F") || unit.equals("FAHRENHEIT")) {
                double rcelsius = FtoCround(degrees);
                System.out.print(degrees + "°F in Celsius is about " + rcelsius + "°C.");
            } else {
                System.out.println("That unit does not exist.");
                System.out.println("Make sure the unit is capitalized for the program to work.");

                String restart;

                do {
                    System.out.print("Do you want to restart the program? (yes/no): ");
                    restart = scanner.nextLine();
                } while (restart.equalsIgnoreCase("yes"));
    
                System.out.println("Program has ended.");
            
        }
        } else if (answer.equals("NO")) {
            if (unit.equals("C") || unit.equals("CELSIUS")) {
                double fahrenheit = CtoF(degrees);
                System.out.print(degrees + "°C in Fahrenheit is about " + fahrenheit + "°F.");
            } else if (unit.equals("F") || unit.equals("FAHRENHEIT")) {
                double celsius = FtoC(degrees);
                System.out.print(degrees + "°F in Celsius is about " + celsius + "°C.");
            } else {
                System.out.println("That unit does not exist.");
                System.out.println("Make sure the unit is capitalized for the program to work.");

                String restart;

                do {
                    System.out.print("Do you want to restart the program? (yes/no): ");
                    restart = scanner.nextLine();
                } while (restart.equalsIgnoreCase("yes"));
    
                System.out.println("Program has ended.");
            
        }
        } else {
            System.out.print("If you can't answer a yes or no question, we won't answer yours either.");
        }
        
        scanner.close();
    
    }

    public static double Round(double value) {
        DecimalFormat x = new DecimalFormat("#.#");
        return Double.parseDouble(x.format(value));
    }

}
