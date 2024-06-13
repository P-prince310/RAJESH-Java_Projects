import java.util.Scanner;
public class Practice {
    public static void solveHanoi(int n , char source, char Temporary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 form"+source+"to"+destination);
            return;
        }
        solveHanoi(n-1,source,destination,Temporary);
        System.out.println("Move disk" +n+ "from" +source+ "to" +destination);
        solveHanoi(n-1,Temporary,source,destination);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of disk");
        int NumberOfDisk = scanner.nextInt();
        solveHanoi(NumberOfDisk, 'L' , 'C' , 'R' );
    }
}