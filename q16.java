import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 5 words
        String[] words = new String[5];
        System.out.println("Enter 5 words:");

        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
        }

        // Perform Bubble Sort to sort words alphabetically
        bubbleSort(words);

        // Print the sorted words
        System.out.println("Words sorted in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }

    // Bubble sort method that sorts words alphabetically
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if the current word is lexicographically greater than the next
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

