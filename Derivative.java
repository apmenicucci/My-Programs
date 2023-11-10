import java.util.Scanner;

public class Derivative {
    public static void main(String[] args) {
        // y = x^2
        // derivative == 2x
        
        Scanner s = new Scanner(System.in);
        System.out.println("POWER RULE CALCULATOR (INT):");
        System.out.print("Enter the coefficient: ");
        int coeff = s.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = s.nextInt();
        System.out.print(testDeriv(coeff, exp));
        s.close();
    }

    public static String testDeriv(int coeff, int exp) {
        return ("The derivative is: " + (coeff*exp) + "x^" + (exp-1));
    }
}