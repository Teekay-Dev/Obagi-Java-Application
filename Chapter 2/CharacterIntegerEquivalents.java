public class CharacterIntegerEquivalents {
    public static void main(String[] args) {
        // An array of characters to display: uppercase, lowercase, digits, special symbols and the blank character
        char[] characters = { 'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ' };

        for (char ch : characters) {
            // Provide a special label for the blank character
            if (ch == ' ') {
                System.out.printf("The blank character has the value %d%n", (int) ch);
            } else {
                System.out.printf("The character %c has the value %d%n", ch, (int) ch);
            }
        }
    }
}
