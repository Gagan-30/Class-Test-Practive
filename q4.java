import java.util.Scanner;

public class q4 {
public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an expression
        System.out.print("Enter an expression (e.g., 3 + 4): ");
        String input = scanner.nextLine();

        // Split the input into parts: number1, operator, number2
        String[] parts = input.split(" ");
        int number1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int number2 = Integer.parseInt(parts[2]);

        // Perform the operation based on the operator
        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2; // Integer division
                break;
            default:
                System.out.println("Invalid operator");
                return; // Exit the program
        }

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
