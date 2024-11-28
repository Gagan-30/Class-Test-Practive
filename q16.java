import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        // Prompt the user for 5 words
        System.out.println("Enter 5 words:");
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }

        // Bubble sort in alphabetical order
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap
                 String temp = words[j];
                 words[j] = words[j + 1];
                 words[j + 1] = temp;
                }
            }
        }

         // Print the sorted words
        System.out.println("Words in alphabetical order:");
        for (String word : words) {
          System.out.println(word);
        }

    scanner.close();
  }
}
