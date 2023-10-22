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
        double f = 1.8;
        double g = 32.0;
        double fahrenheit = (f * degrees) + g;
        return fahrenheit;
    }

    public static double FtoC(double degrees) {
        double h = 9.0;
        double i = 5.0;
        double j = 32.0;
        double celsius = (degrees - j) * (i/h);
        return celsius;
    }

    public static void main(String[] args) {
        double degrees;

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        //Welcome messages, request for input
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("What unit are you starting with? ");
        String unit = scanner.nextLine();
        while (!unit.equals("C") && !unit.equals("F") && !unit.equals("Celsius") && !unit.equals("Fahrenheit")) {
            System.out.println("Unrecognized unit. Make sure the first letter of the unit is capitalized.");
            System.out.print("What unit are you starting with? ");
            unit = scanner.nextLine();
        }

        do {
            try {
                System.out.print("How many degrees " + unit + " are there? ");
                degrees = scanner.nextDouble();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                // Handle input that is not a double
                System.out.println("Invalid input. Please enter a valid double.");
                scanner.nextLine(); // Consume the invalid input
                degrees = Double.NaN; // Set to a non-numeric value to continue the loop
            }
        } while (Double.isNaN(degrees));

        System.out.print("Would you like your conversion to be rounded? (Yes/No) ");
        String answer = scanner.next().toUpperCase();
        System.out.println("Doing the conversion...");

        if (answer.equals("YES")) {
            if (unit.equals("C") || unit.equals("Celsius")) {
            double rfahrenheit = CtoFround(degrees);
            System.out.print(degrees + "°C in Fahrenheit is about " + rfahrenheit + "°F.");
            } else if (unit.equals("F") || unit.equals("Fahrenheit")) {
                double rcelsius = FtoCround(degrees);
                System.out.print(degrees + "°F in Celsius is about " + rcelsius + "°C.");
            }
        } else if (answer.equals("NO")) {
            if (unit.equals("C") || unit.equals("Celsius")) {
                double fahrenheit = CtoF(degrees);
                System.out.print(degrees + "°C in Fahrenheit is about " + fahrenheit + "°F.");
            } else if (unit.equals("F") || unit.equals("Fahrenheit")) {
                double celsius = FtoC(degrees);
                System.out.print(degrees + "°F in Celsius is about " + celsius + "°C.");
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
