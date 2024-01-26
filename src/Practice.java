import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = user.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
