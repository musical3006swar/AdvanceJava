// Java Program for Reversing the characters in a string using user-defined function reverseString()

package string_operations;

import java.util.Scanner;

public class ReverseCharacterString {
    // User-defined function to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        // Call user-defined function
        String reversed = reverseString(original);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
