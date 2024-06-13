import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate the sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of the first 1 natural number is 1
        } else {
            return n + sumOfNaturalNumbers(n - 1); // Recursive case
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
            // Calculate the sum of the first n natural numbers
            int result = sumOfNaturalNumbers(n);

            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is " + result);
        }

        scanner.close();
    }
}
