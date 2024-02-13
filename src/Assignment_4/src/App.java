import java.util.Scanner;
public class App {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String reversedString = reverseString(userInput);

        System.out.println("Reversed sentence: " + reversedString);
    }
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}

