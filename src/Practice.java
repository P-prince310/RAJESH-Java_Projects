import java.util.Scanner;

public class Practice {
    private static int totalMoves = 0;

    public static void solveHanoi(int n, char source, char temporary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            totalMoves++;
            return;
        }
        solveHanoi(n - 1, source, destination, temporary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        totalMoves++;
        solveHanoi(n - 1, temporary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        solveHanoi(numberOfDisks, 'L', 'C', 'R');
        System.out.println("Total moves: " + totalMoves);
        scanner.close();
    }
}
