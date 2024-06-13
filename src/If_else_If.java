import java.util.Scanner;
public class If_else_If {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your numeric score (0-100): ");
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score between 0 and 100.");
            } else if (score >= 90) {
                System.out.println("Grade: A+");
            } else if (score >= 85) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: Fail");
            }

            scanner.close();
        }
    }
