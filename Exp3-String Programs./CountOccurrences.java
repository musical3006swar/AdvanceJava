// Java Program for counting the number of words in a string
// using user-defined function countWords()

package string_operations;

import java.util.Scanner;

public class CountOccurrences {
    // User-defined function to count words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Call user-defined function
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}
