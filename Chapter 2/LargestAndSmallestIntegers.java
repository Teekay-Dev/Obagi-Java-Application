import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for five integers.
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();
        
        System.out.print("Enter the fourth integer: ");
        int number4 = input.nextInt();
        
        System.out.print("Enter the fifth integer: ");
        int number5 = input.nextInt();
        
        // Assume the first integer is both the smallest and largest.
        int smallest = number1;
        int largest = number1;
        
        // Compare and update smallest and largest for each subsequent integer.
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        if (number4 < smallest) {
            smallest = number4;
        }
        if (number4 > largest) {
            largest = number4;
        }
        
        if (number5 < smallest) {
            smallest = number5;
        }
        if (number5 > largest) {
            largest = number5;
        }
        
        // Display the smallest and largest integers.
        System.out.printf("Smallest integer: %d%n", smallest);
        System.out.printf("Largest integer: %d%n", largest);
    }
}
