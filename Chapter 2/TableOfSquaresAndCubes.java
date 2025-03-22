public class TableOfSquaresAndCubes {
    public static void main(String[] args) {
        // Print the header of the table.
        System.out.printf("%-6s %-6s %-6s%n", "Number", "Square", "Cube");

        // Loop from 0 through 10.
        for (int number = 0; number <= 10; number++) {
            // Calculate the square and cube of the current number.
            int square = number * number;
            int cube = number * number * number;

            // Print the current number, its square, and its cube.
            // The %-6d specifier aligns the numbers in columns with a width of 6.
            System.out.printf("%-6d %-6d %-6d%n", number, square, cube);
        }
    }
}
