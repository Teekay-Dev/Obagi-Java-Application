import java.util.Scanner;

public class NumberSignCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Counters for the different types of numbers
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter five numbers:");

        // Loop five times to process each number
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Output the results
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);

        input.close();
    }
}
