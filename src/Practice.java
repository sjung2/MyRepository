import java.util.Scanner;
public class Practice {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year of your car: ");
        String year = scan.nextLine();
        System.out.print("Enter the make of your car: ");
        String make = scan.nextLine();
        System.out.print("Enter the model of your car: ");
        String model = scan.nextLine();


        System.out.print("Your car is a "+ year + " " + make + " " + model);


    }
}