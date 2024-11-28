import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
    System.out.println("Enter word: ");
		String word = scan.nextLine();
    String result = "";
    
		for(int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
    System.out.println(result);
	}
}
