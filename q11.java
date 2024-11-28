
public class q11 {
    // Counter to track the number of times fib is called
    private static int callCount = 0;

    public static void main(String[] args) {
        // Reset the counter
        callCount = 0;
        int n = 4; // Find the 4th Fibonacci number
        System.out.println("Fib(" + n + ") = " + fib(n));
        System.out.println("fib was called " + callCount + " times for fib(" + n + ")");
    }

    // Recursive method to calculate the Fibonacci number
    public static int fib(int n) {
        callCount++; // Increment the counter each time the method is called
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

