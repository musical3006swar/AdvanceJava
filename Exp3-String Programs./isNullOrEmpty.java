// Java Program for checking if a given string is null or contains only whitespace using isNullOrEmpty()

package string_operations;

import java.util.Scanner;
public class isNullOrEmpty{
    // User-defined function to check null or whitespace
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using the custom function
        if (isNullOrEmpty(input)) {
            System.out.println("The input string is null or contains only whitespace.");
        } else {
            System.out.println("The input string is valid: \"" + input + "\"");
        }
        scanner.close();
    }
}
