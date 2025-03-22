import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to obtain input from the user.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();
        
        // Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();
        
        // Calculate the sum, product, and difference.
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        int difference = firstNumber - secondNumber;
        
        // Output the sum, product, and difference.
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Difference: %d%n", difference);
        
        // Compute and output the quotient if division is possible.
        if (secondNumber != 0) {
            int quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %d%n", quotient);
        } else {
            System.out.println("Quotient: Division by zero is not allowed.");
        }
    }
}
