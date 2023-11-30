import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }

        scanner.close();
    }
}

OUTPUT:
Enter the value of m: 4
Enter the value of n: 5
1x4=4
2x4=8
3x4=12
4x4=16
5x4=20
