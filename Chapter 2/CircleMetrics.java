import java.util.Scanner;

public class CircleMetrics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the radius as an integer
        System.out.print("Enter the radius as an integer: ");
        int radius = input.nextInt();

        // Using 3.14159 as the value of π
        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %f%n", 2 * 3.14159 * radius);
        System.out.printf("Area: %f%n", 3.14159 * radius * radius);
    }
}
