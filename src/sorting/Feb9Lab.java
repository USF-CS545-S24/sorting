package sorting;

import java.util.Arrays;

public class Feb9Lab {

    /**
     * Sort the given array of 0s and 1s in linear time and one pass
     * using the algorithm discussed during the lab
     * @param arr input array
     */
    public static void sort01(int[] arr) {
        int i = 0; // starts at the beginning
        int j = arr.length - 1; // starts at the end
        // FILL IN CODE

    }

    /**
     * Pick the middle element of the array as the pivot.
     * Partition the input array (in linear time, in one pass) so that elements on the left of the pivot are smaller than pivot,
     * and elements that are larger than pivot (or equal to pivot) are on the right side of the pivot
     * @param arr input array
     */
    public static void partitionArray(int[] arr) {
        int n = arr.length;
        int midIndex = n / 2;
        int pivotElement = arr[midIndex];
        int i = 0;
        int j = n - 2;

        // FILL IN CODE
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr1));
        sort01(arr1);
        System.out.println(Arrays.toString(arr1));

        /*
        // Uncomment to test "partitionArray"
        int[] arr2 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println(Arrays.toString(arr2));
        partitionArray(arr2); // 6 is the pivot in this example
        System.out.println(Arrays.toString(arr2));
         */
    }
}

