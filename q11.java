public class q11 {
    public static void main(String[] args) {
        System.out.println("First 8 Fibonacci numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Fib(" + i + ") = " + fib(i));
        }

        // Count calls for fib(4)
        System.out.println("\nNumber of calls to fib(4): " + countFibCalls(4));
    }

    // Recursive method to calculate the Fibonacci number
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Method to count how many times fib() is called for a given n
    public static int countFibCalls(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case is called exactly once
        } else {
            return 1 + countFibCalls(n - 1) + countFibCalls(n - 2); // Each call counts itself + its two sub-calls
        }
    }
}

