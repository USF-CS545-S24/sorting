package sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class Feb16Lab {
    /**
     * @param arr input array
     * Assume the range of elements  in the array is from 0 to maxValue
     * @param maxValue the largest value that we can have in the array
     * Note: this is not how the counting sort is typically implemented
     */
    public static void basicCountingSort(int[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        // Iterate over arr, and for each val = arr[i], increment counterArray[val].
        // FILL IN CODE
        // Iterate over the counter array, and use it to sort arr
        // FILL IN CODE

    }

    /**
     * Bin sort implementation - first adds each element to the linked list
     * for the correct "bin", then uses array of bins to sort arr.
     * @param arr input array of records
     * @param maxValue largest value of the key; all keys are from 0 to maxValue.
     */
    public static void binSort(Elem[] arr, int maxValue) {
        int i;
        // create bins and empty linked list for each bin.
        LinkedList<Elem>[] bins = new LinkedList[maxValue+1];
        for (i = 0; i <= maxValue; i++)
            bins[i] = new LinkedList<Elem>();

        // FILL IN CODE: iterate over elements of arr, and add each element
        // to the linked list of the correct "bin"
        // FILL IN CODE: iterate over bins, and place elements from each linked
        // list back into arr

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 3, 0, 1, 3, 6, 4};
        basicCountingSort(arr, 6);
        System.out.println(Arrays.toString(arr));

        Elem[] records = {
                new Elem(6, "red"),
                new Elem(1, "blue"),
                new Elem(6, "yellow"),
                new Elem(2, "black"),
                new Elem(1, "brown"),
                new Elem(6, "orange"),
                new Elem(0, "green"),
                new Elem(6, "gray")};
        binSort(records, 6);
        System.out.println(Arrays.toString(records));

    }

}
