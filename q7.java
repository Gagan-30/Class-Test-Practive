import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class q7 {
	public static void main (String[] args) throws Exception {
		String fileName = "words.txt";
		File file = new File(fileName);

		ArrayList<String> words = new ArrayList<>();

		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			words.add(scan.nextLine());
		}
		scan.close();

		for(int i = words.size() - 1; i >=0; i--) {
			System.out.println(words.get(i));
		}
	}
}
