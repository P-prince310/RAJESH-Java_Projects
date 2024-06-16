import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the lengths of the two sides
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        // Calculate the hypotenuse
        double hypotenuse = Math.sqrt(a * a + b * b);

        // Display the result
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);

        // Close the scanner
        scanner.close();
    }
}
