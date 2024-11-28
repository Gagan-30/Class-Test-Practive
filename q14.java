import java.util.Scanner;

public class q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Calculate the GCD using Euclid's algorithm
        int gcd = gcd(a, b);

        // Print the result
        System.out.println("The Greatest Common Divisor (GCD) of " + a + " and " + b + " is: " + gcd);
        
        scanner.close();
    }

    // Method to calculate GCD using Euclid's algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Get remainder
            a = temp; // Set a to b
        }
        return a; // When b becomes 0, a is the GCD
    }
}
