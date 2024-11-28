public class q13 {
    public static void main(String[] args) {

        int max = 50; // Define the upper limit for the array (range of numbers to check for primes)
        int[] isPrime = new int[max]; // Create an array to track non-prime numbers (0 = prime, 1 = non-prime)

        // Outer loop: start with the number 2 and go up to the upper limit
        for (int i = 2; i < max; i++) {
            // Inner loop: mark multiples of 'start' as non-prime (starting from start*2)
            for (int j = i * 2; j < max; j = j + i) {
                isPrime[j] = 1; // Mark non-prime numbers by setting buffer[mult] to 1
            }
        }

        // Loop through the buffer and print out all prime numbers
        for (int i = 2; i < max; i++) {
            if (isPrime[i] == 0)   //prime are 0, non prime are 1
                System.out.println(i); // Print  prime number
        }
    }
}
