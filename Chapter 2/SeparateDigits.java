import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a five-digit number.
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // Extract each digit using division and remainder (modulus) operations.
        int digit1 = number / 10000;              // Extracts the ten-thousands digit.
        int digit2 = (number % 10000) / 1000;       // Extracts the thousands digit.
        int digit3 = (number % 1000) / 100;         // Extracts the hundreds digit.
        int digit4 = (number % 100) / 10;           // Extracts the tens digit.
        int digit5 = number % 10;                   // Extracts the ones digit.

        // Print the separated digits with three spaces between each.
        System.out.printf("%d   %d   %d   %d   %d%n",
            digit1, digit2, digit3, digit4, digit5);

        input.close();
    }
}
