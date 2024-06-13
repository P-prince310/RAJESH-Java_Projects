import java.util.Scanner;

    public class TOHtwo {

        // Recursive method to solve Tower of Hanoi
        public static void solveHanoi(int n, char source, char auxiliary, char destination) {
            if (n == 1) {
                // Base case: only one disk to move
                System.out.println("Move disk 1 from " + source + " to " + destination);
                return;
            }

            // Move top n-1 disks from source to auxiliary, using destination as temporary pole
            solveHanoi(n - 1, source, destination, auxiliary);

            // Move the nth disk from source to destination
            System.out.println("Move disk " + n + " from " + source + " to " + destination);

            // Move the n-1 disks from auxiliary to destination, using source as temporary pole
            solveHanoi(n - 1, auxiliary, source, destination);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of disks from the user
            System.out.print("Enter the number of disks: ");
            int numberOfDisks = scanner.nextInt();

            // Solve Tower of Hanoi
            solveHanoi(numberOfDisks, 'A', 'B', 'C');

            scanner.close();
        }
    }

