// Java Program for verifying if a string contains only numeric characters
// using user-defined function isNumeric()

package string_operations;
import java.util.Scanner;
public class NumericCheck {
    // User-defined function to check if a string is numeric
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Check each character
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a string to check if it is numeric: ");
        String input = scanner.nextLine();
        // Call user-defined function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }
        scanner.close();
    }
}
