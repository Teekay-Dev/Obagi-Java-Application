import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to obtain input from the user.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();
        
        // Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();
        
        // Compare the two numbers and print the appropriate message.
        if (firstNumber > secondNumber) {
            System.out.printf("%d is larger%n", firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.printf("%d is larger%n", secondNumber);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
