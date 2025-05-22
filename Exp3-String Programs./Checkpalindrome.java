// Java Program to check if a string is a palindrome (ignoring case and punctuation)
// using user-defined function isPalindrome()

package string_operations;
import java.util.Scanner;
public class PalindromeChecker {

    // User-defined function to check palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare characters from start and end
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        // Call user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
