//(a) Using One System.out.println Statement
//When using System.out.println, we create one string that includes both the numbers and the separating spaces:
public class DisplayUsingPrintln {
    public static void main(String[] args) {
        // Using one System.out.println statement.
        System.out.println("1 2 3 4");
    }
}


//(b) Using Four System.out.print Statements
//Here, we use four separate System.out.print calls to print each number (and the space after it when needed). We can omit the extra space after the last number:
public class DisplayUsingPrint {
    public static void main(String[] args) {
        // Using four System.out.print statements.
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
    }
}


//(c) Using One System.out.printf Statement
//Using System.out.printf, we provide a format string that specifies each integer and the spaces between them:
public class DisplayUsingPrintf {
    public static void main(String[] args) {
        // Using one System.out.printf statement.
        System.out.printf("%d %d %d %d", 1, 2, 3, 4);
    }
}