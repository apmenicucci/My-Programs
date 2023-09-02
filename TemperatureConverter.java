// Write a program that allows users to convert temperatures between Celsius and Fahrenheit. 
// This program will take a temperature value and a choice of conversion
// (Celsius to Fahrenheit or vice versa) as input and provide the converted temperature as output.
// Input, basic math operations, and conditional statements

import java.util.Scanner;

public class TemperatureConverter {
    
    public static double FtoC(double cels) {
        double a = 1.8;
        double b = 32.0;
        double degrees = nextDouble();
        return (a * degrees) + b;
    }

    private static double nextDouble() {
        return 0;
    }

    public static double CtoF(double fahr) {
        double c = 9.0;
        double d = 5.0;
        double e = 32.0;
        double degrees = nextDouble();
        return (degrees - e) * (c/d);
    }

    public static void main(String[] args) {
        // Open scanner
        Scanner scanner = new Scanner(System.in);

        //Welcome messages, request for input
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("What unit are you starting with?");
        String unit = scanner.nextLine();
        System.out.print("How many degrees °" + unit + " are there?");
        double degrees = scanner.nextDouble();

        

        if (unit.equals("C") || unit.equals("Celsius")) {
            System.out.print(degrees + "°C in Fahrenheit is " + cels + "°F.");
        } else if (unit.equals("F") || unit.equals("Fahrenheit")) {
            System.out.print(degrees + "°F in Celsius is " + fahr + "°C.");
        } else {
            System.out.println("That unit does not exist.");
            System.out.println("Make sure the unit is capitalized for the program to work.");

            String restart;
            do {
                // Your program logic here
    
                System.out.print("Do you want to restart the program? (yes/no): ");
                restart = scanner.nextLine();
            } while (restart.equalsIgnoreCase("yes"));
    
            System.out.println("Program has ended.");
            scanner.close();
        }
    }
}
