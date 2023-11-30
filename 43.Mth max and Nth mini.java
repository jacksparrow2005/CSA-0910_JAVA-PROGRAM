import java.util.Arrays;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int m = 1;
        int n = 3;

        Arrays.sort(array);

        int mthMax = array[array.length - m];

        int nthMin = array[n - 1];

        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println("Array of elements: " + Arrays.toString(array));
        System.out.println(m + "st Maximum Number = " + mthMax);
        System.out.println(n + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
OUTPUT:

Array of elements: [14, 16, 25, 34, 36, 87, 89]
1st Maximum Number = 89
3th Minimum Number = 25
Sum = 114
Difference = 64
