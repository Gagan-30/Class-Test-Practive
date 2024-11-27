public class q12 {
    public static void main(String[] args) {
        System.out.println("f(8): " + f(8));
        System.out.println("f(9): " + f(9));

        System.out.println("Number of calls to f(4): " + countCalls(4));
    }

    // Recursive implementation of f(n)
    public static int f(int n) {
        if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2) + f(n - 3);
        }
    }

    // Count the number of times f(n) is called
    public static int countCalls(int n) {
        if (n < 2) {
            return 1; // Base case counts as one call
        } else {
            return 1 + countCalls(n - 1) + countCalls(n - 2) + countCalls(n - 3);
        }
    }
}

