// Java Program for eliminating all whitespace characters from a string
// using user-defined function removeWhitespace()

package string_operations;
import java.util.Scanner;
public class RemoveWhitespace {
    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }
        // \s matches any whitespace character (spaces, tabs, newlines)
        return input.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();
        // Call user-defined function
        String result = removeWhitespace(input);
        System.out.println("String after removing all whitespace: " + result);
        scanner.close();
    }
}
