// Java Program for shortening a string to a specified length and adding an ellipsis
// using user-defined function truncate()

package string_operations;
import java.util.Scanner;
public class Truncate {
    // User-defined function to truncate string and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength < 0) {
            return "";
        }
        // If input is shorter than or equal to maxLength, return as-is
        if (input.length() <= maxLength) {
            return input;
        }
        // If maxLength is less than or equal to 3, return only ellipsis
        if (maxLength <= 3) {
            return "...";
        }
        // Truncate and append ellipsis
        return input.substring(0, maxLength - 3) + "...";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter the original string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();
        // Call user-defined function
        String result = truncate(input, maxLength);
        System.out.println("Truncated string: " + result);
        scanner.close();
    }
}
