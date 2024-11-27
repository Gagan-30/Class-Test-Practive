import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 5 integers
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Perform Bubble Sort in descending order
        bubbleSortDescending(numbers);

        // Print the sorted array
        System.out.println("Numbers sorted in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Bubble sort method that sorts in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap if the current element is smaller than the next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

