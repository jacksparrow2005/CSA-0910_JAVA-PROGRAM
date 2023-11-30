mport java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("First " + n + " perfect numbers are: ");
        int count = 0;
        int number = 1;

        while (count < n) {
            if (isPerfect(number)) {
                System.out.print(number + " , ");
                count++;
            }
            number++;
        }

        scanner.close();
    }

    static boolean isPerfect(int num) {
        int sum = 1; 

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}

OUTPUT:
Enter the value of n: 5
First 5 perfect numbers are: 1 , 6 , 28 , 496 , 8128
