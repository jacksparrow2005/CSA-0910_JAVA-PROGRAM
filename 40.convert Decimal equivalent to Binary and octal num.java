import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = convertToBinary(decimalNumber);
        String octalNumber = convertToOctal(decimalNumber);
        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal = " + octalNumber);

        scanner.close();
    }
    private static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
    private static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
OUTPUT:
C:\Users\VAISHNAVI.R\OneDrive\Desktop>javac DecimalToBinaryOctal.java

C:\Users\VAISHNAVI.R\OneDrive\Desktop>java DecimalToBinaryOctal
Enter Decimal Number: 111
Binary Number = 1101111
Octal = 157
