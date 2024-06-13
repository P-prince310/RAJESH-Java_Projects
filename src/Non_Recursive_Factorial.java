import java.util.Scanner;

public class Non_Recursive_Factorial {

    // Iterative method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i for each iteration
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long result = factorial(number);

        // Print the result
        System.out.println("The factorial of " + number + " is " + result);

        scanner.close();
    }
}
