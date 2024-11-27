public class q13 {
    public static void main(String[] args) {
        int k = 50;    
        sieve(k); 
    }

    public static void sieve(int upper) {

        int[] buffer = new int[upper]; // Create an array to track non-prime numbers (0 = prime, 1 = non-prime)

        // Outer loop: start with the number 2 and go up to the upper limit
        for (int start = 2; start < upper; start++) {
            // Inner loop: mark multiples of 'start' as non-prime (starting from start*2)
            for (int mult = start * 2; mult < upper; mult = mult + start) {
                buffer[mult] = 1; // Mark non-prime numbers by setting buffer[mult] to 1
            }
        }

        // Loop through the buffer and print out all prime numbers
        for (int i = 2; i < upper; i++) {
            if (buffer[i] == 0)   //prime are 0, non prime are 1
                System.out.println(i); // Print  prime number
        }
    }
}
