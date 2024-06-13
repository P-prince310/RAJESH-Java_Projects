import java.util.Scanner;

public class REcursiveFactorial {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the input is a non-negative integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using the recursive function
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }

        scanner.close();
    }
}
