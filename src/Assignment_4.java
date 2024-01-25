
import java.util.Scanner;
public class Assignment_4 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the reverseString method
        String reversedString = reverseString(userInput);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
