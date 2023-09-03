// Display a menu of operations for the user to choose from (+ for addition, - for subtraction, 
// * for multiplication, / for division)
// Prompt the user to enter two numbers
// Perform the selected operation on the two numbers
// Display the result to the user
// Allow the user to perform another calculation or exit the program

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fnumber;
        double snumber;
        double answer;
        char another;

        do {
            System.out.println("Welcome to the Basic Calculator!");
            System.out.println("What operation would you like to do today:");
            System.out.println("Addition (+), Subtraction (-), Multiplication (*), or Division (/)?");
            System.out.print("Enter the operation symbol: ");
            String operation = scanner.nextLine();

            while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Unrecognized operation. Make sure you type what is in the parentheses above.");
                System.out.print("Enter the operation symbol: ");
                operation = scanner.nextLine();
            }

            answer = 0; // In Java, local variables must be assigned a value before you can use them. 
                        // This is a safety measure to prevent unintended behavior caused by using uninitialized variables.

            do {
                try {
                    System.out.print("Enter your first number: ");
                    fnumber = scanner.nextDouble();
                    scanner.nextLine();
                } catch (java.util.InputMismatchException e) {
                    // Handle input that is not a double
                    System.out.println("Invalid input. Please enter a valid double.");
                    scanner.nextLine(); // Consume the invalid input
                    fnumber = Double.NaN; // Set to a non-numeric value to continue the loop
                }
            } while (Double.isNaN(fnumber));

            do {
                try {
                    System.out.print("Enter your second number: ");
                    snumber = scanner.nextDouble();
                    scanner.nextLine();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid double.");
                    scanner.nextLine();
                    snumber = Double.NaN;
                }
            } while (Double.isNaN(snumber));

            switch (operation) {
                case "+":
                    answer = fnumber + snumber;
                    break;
                case "-":
                    answer = fnumber - snumber;
                    break;
                case "*":
                    answer = fnumber * snumber;
                    break;
                case "/":
                    if (snumber != 0) {
                     answer = fnumber / snumber;
                    } else {
                        System.out.println("You cannot divide by zero.");
                        answer = Double.NaN;
                    }
                    break;
                default:
                   System.out.println("Unrecognized operation.");
            }
        
            System.out.println("The answer is " + answer);
            System.out.print("Would you like to do another calculation? (Y/N) ");
            another = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            if (another != 'Y' && another != 'N') {
                System.out.println("All you had to do was type 'Y' or 'N', and you STILL failed.");
            } else {
                ;
            }

        } while (another == 'Y');

    System.out.println("Thank you for using the Basic Calculator.");
    System.out.print("Basic Calculator closed.");
    scanner.close();

    }
    
}
