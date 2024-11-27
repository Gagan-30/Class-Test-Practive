import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class q10 {
  public static void main(String[] args) throws Exception {
    String fileName = "words.txt";
    ArrayList<String> lines = new ArrayList<>();
    
    Scanner scan = new Scanner(new File(fileName));
    while(scan.hasNextLine()) {
      lines.add(scan.nextLine());
    }
    scan.close();

    for (int i = lines.size() -1; i >=0; i--) {
      String line = lines.get(i);
      System.out.println(line.length() + ":" + line);
    }
  }
}
