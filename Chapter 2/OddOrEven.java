import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        // Create a Scanner object to obtain input from the user.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an integer.
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Determine if the number is even (i.e., a multiple of 2) or odd.
        // If the remainder when dividing by 2 is 0, the number is even.
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}
