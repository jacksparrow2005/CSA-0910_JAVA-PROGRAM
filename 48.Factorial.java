import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);

        scanner.close();
    }

    static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}

OUTPUT:
Enter the value of n: 6
The factorial of 6 is: 720
