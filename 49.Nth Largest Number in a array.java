import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] list = {14, 67, 48, 23, 5, 62};
        int n = 4;

        int nthLargest = findNthLargest(list, n);

        if (nthLargest != Integer.MIN_VALUE) {
            System.out.println(n + "th Largest number: " + nthLargest);
        } else {
            System.out.println("Invalid value of N. Please provide a valid value.");
        }
    }

    private static int findNthLargest(int[] arr, int n) {
        if (n > 0 && n <= arr.length) {
            Arrays.sort(arr);
            int index = arr.length - n;
            return arr[index];
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
OUTPUT:

4th Largest number: 23
