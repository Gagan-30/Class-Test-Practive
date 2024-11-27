import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class q9 {
    public static void main(String[] args) throws Exception {
        String fileName = "numbers.txt"; // Name of the file to read

        // Step (i): Count the number of lines in the file
        int numberOfLines = 0;
        Scanner lineCounter = new Scanner(new File(fileName));
        while (lineCounter.hasNextLine()) {
            lineCounter.nextLine();
            numberOfLines++;
        }
        lineCounter.close();

        // Step (ii): Allocate an array of size numberOfLines
        int[] numbers = new int[numberOfLines];

        // Step (iii): Read the file again and populate the array
        Scanner fileReader = new Scanner(new File(fileName));
        int index = 0;
        while (fileReader.hasNextLine()) {
            numbers[index++] = Integer.parseInt(fileReader.nextLine().trim());
        }
        fileReader.close();

        // Step (iv): Compute statistics
        // Sort the array (it's already sorted based on the problem description, but we'll ensure it here)
        Arrays.sort(numbers);

        // Calculate the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the mean
        double mean = (double) sum / numberOfLines;

        // Calculate the median
        double median;
        if (numberOfLines % 2 == 0) {
            median = (numbers[numberOfLines / 2 - 1] + numbers[numberOfLines / 2]) / 2.0;
        } else {
            median = numbers[numberOfLines / 2];
        }

        // Calculate the lower quartile (Q1) and upper quartile (Q3)
        double lowerQuartile = calculateMedian(Arrays.copyOfRange(numbers, 0, numberOfLines / 2));
        double upperQuartile = calculateMedian(Arrays.copyOfRange(numbers, (numberOfLines + 1) / 2, numberOfLines));

        // Find numbers that appear more than once
        ArrayList<Integer> duplicates = findDuplicates(numbers);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Lower Quartile (Q1): " + lowerQuartile);
        System.out.println("Upper Quartile (Q3): " + upperQuartile);
        System.out.print("Duplicates: ");
        if (duplicates.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(duplicates);
        }
    }

    // Helper method to calculate the median of an array
    private static double calculateMedian(int[] arr) {
        int length = arr.length;
        if (length == 0) return 0; // Handle edge case for empty array
        if (length % 2 == 0) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            return arr[length / 2];
        }
    }

    // Helper method to find duplicates in the sorted array
    private static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
}
