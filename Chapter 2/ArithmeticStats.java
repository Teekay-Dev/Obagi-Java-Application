import java.util.Scanner;

public class ArithmeticStats {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers.
        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        // Calculate the sum of the three integers.
        int sum = first + second + third;

        // Calculate the average using integer division.
        // Note: Integer division will discard any fractional part.
        int average = sum / 3;

        // Calculate the product of the three integers.
        int product = first * second * third;

        // Determine the smallest of the three integers.
        int smallest = first;
        if (second < smallest) {
            smallest = second;
        }
        if (third < smallest) {
            smallest = third;
        }

        // Determine the largest of the three integers.
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        // Display the results.
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Smallest is %d%n", smallest);
        System.out.printf("Largest is %d%n", largest);
    }
}
