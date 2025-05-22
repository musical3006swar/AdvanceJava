// Java Program for creating a random string of a specified length
// using user-defined function generateRandomString()

package string_operations;
import java.security.SecureRandom;
import java.util.Scanner;
public class GenerateRandomString {
    // User-defined function to generate random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }
        // Characters to choose from (letters and digits)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get length from user
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Generate and print random string
        String randomString = generateRandomString(length);
        System.out.println("Generated random string: " + randomString);
        scanner.close();
    }
}
