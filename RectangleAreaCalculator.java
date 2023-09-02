import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome messages, request for input
        System.out.println("Welcome to the Rectangle Area Calculator!");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the unit of measurement: ");
        String units = scanner.next();

        // Calculations done here
        double area = length * width;

        // Result shown
        System.out.println("The area of the rectangle is " + area + " " + units + ".");
        System.out.print("Thanks for using the Rectangle Area Calculator!");

        // Close the scanner
        scanner.close();
    }
}
