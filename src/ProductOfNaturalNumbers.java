import java.util.Scanner;

public class ProductOfNaturalNumbers {

    // Recursive method to calculate the product of first n natural numbers
    public static long productOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; // Base case: the product of the first 1 natural number is 1
        } else {
            return n * productOfNaturalNumbers(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the integer n from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Ensure the input is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the product of the first n natural numbers
            long result = productOfNaturalNumbers(n);

            // Print the result
            System.out.println("The product of the first " + n + " natural numbers is " + result);
        }

        scanner.close();
    }
}
