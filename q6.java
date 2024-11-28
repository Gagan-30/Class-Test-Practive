import java.util.Scanner;
import java.io.File;

public class q6 {
	public static void main(String[] args) throws Exception {
		String fileName = "words.txt";
		File file = new File(fileName);

		Scanner scan = new Scanner(file);

		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(line.length() > 10) {
				System.out.println(line);
			}
		}
		scan.close();
	}
}
