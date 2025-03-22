 import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three integers
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int z = input.nextInt();

        // Compute product
        int result = x * y * z;

        // Display result
        System.out.printf("Product is %d%n", result);

        input.close();
    }
}
