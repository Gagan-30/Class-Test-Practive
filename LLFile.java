import java.io.File;
import java.util.Scanner;

public class LLFile {
    public static void main(String[] args) throws Exception {
        String fileName = "words.txt"; // Name of the file to read
        File file = new File(fileName);

        LLNode head = null; // Head of the linked list

        // Read the file line by line
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            // Insert each line at the head of the list
            head = new LLNode(word, head);
        }
        scanner.close(); // Close the scanner

        // Print the linked list (which is in reverse order of the file)
        LLNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
