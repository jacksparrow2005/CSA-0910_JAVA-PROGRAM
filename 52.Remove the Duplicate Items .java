import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 4, 9, 2, 7, 5};

        int[] resultArray = removeDuplicates(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }

    private static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int value : array) {
            uniqueSet.add(value);
        }

        int[] resultArray = new int[uniqueSet.size()];
        int index = 0;
        for (int value : uniqueSet) {
            resultArray[index++] = value;
        }

        return resultArray;
    }
}
OUTPUT:
Original Array: [4, 7, 2, 4, 9, 2, 7, 5]
Array after removing duplicates: [2, 4, 5, 7, 9]
