public class q12 {
    public static void main(String[] args) {
        System.out.println("f(8): " + f(8));
        System.out.println("f(9): " + f(9));
    }

    // Recursive implementation of f(n)
    public static int f(int n) {
        if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2) + f(n - 3);
        }
    }

}
