package sorting;

import java.util.Arrays;

public class Feb9LabSolution {

    /**
     * Sort the given array of 0s and 1s in linear time and one pass
     * using the algorithm discussed during the lab
     * @param arr input array
     */
    public static void sort01(int[] arr) {
        // FILL IN CODE
        int i = 0; // starts at the beginning
        int j = arr.length - 1; // starts at the end

        while (i < j) {
            while (i < j && arr[i]  == 0)
                i++;
            while (i < j && arr[j] == 1)
                j--;
            if ( i < j) { // swap
                arr[i] = 0;
                arr[j] = 1;
            }
        }


    }

    public static void partitionArray(int[] arr) {
        int n = arr.length;
        int midIndex = n / 2;
        int pivotElement = arr[midIndex];
        System.out.println(pivotElement);
        // swap pivot out of the way
        int tmp = arr[midIndex];
        arr[midIndex] = arr[n - 1];
        arr[n - 1] = tmp;

        int i = 0;
        int j = n - 2;

        while (i <= j) {
            while (i<=j && arr[i] < pivotElement)
                i++;
            while (i<=j && arr[j] >= pivotElement)
                j--;
            if (i< j) {
                int tmp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp1;
                i++;
                j--;
            }
        }
        // swap the pivot element back into place (swap it with element at i)
        arr[n-1] = arr[i];
        arr[i] = pivotElement;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr1));
        sort01(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println(Arrays.toString(arr2));
        partitionArray(arr2); // 6 is the pivot in this example
        System.out.println(Arrays.toString(arr2));
    }
}
