// Java Program for capitalizing the first letter of each word
// using user-defined function capitalizeWords()

package string_operations;
import java.util.Scanner;
public class CapitalizeWords {
    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.trim().split("\\s+"); // split by one or more spaces
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))  // capitalize first letter
                           .append(word.substring(1).toLowerCase())        // append the rest in lowercase
                           .append(" ");
            }
        }

        return capitalized.toString().trim(); // remove extra space at the end
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        // Call user-defined function
        String result = capitalizeWords(input);
        System.out.println("Capitalized String: " + result);
        scanner.close();
    }
}
