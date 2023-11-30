import java.util.Scanner;

public class BinaryToDecimalOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = binaryToDecimal(binaryNumber);

        String octalNumber = decimalToOctal(decimalNumber);

        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Octal: " + octalNumber);

        scanner.close();
    }

    static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    static String decimalToOctal(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return octal;
    }
}

OUTPUT:

Enter the binary number: 1101
Decimal Number: 13
Octal: 15
