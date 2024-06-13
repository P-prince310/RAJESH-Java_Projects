import java.util.Scanner;
public class Practice {
    public static void solveHanoi(int n, char source,char temporary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 form"+source+"to"+destination);
            return;
        }
        solveHanoi(n-1,source,destination,temporary);
        System.out.println("Move disk"+n+"from"+source+ "to"+destination);
        solveHanoi(n-1,temporary,source,destination);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disk");

        int numberofdisk = scanner.nextInt();
        solveHanoi(numberofdisk, 'L', 'C', 'R');
        scanner.close();
    }
}