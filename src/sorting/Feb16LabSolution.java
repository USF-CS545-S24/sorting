package sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Feb16LabSolution {
    /**
     * @param arr input array
     * Assume the range of elements  in the array is from 0 to maxValue
     * @param maxValue the largest value that we can have in the array
     * Note: this is not how the counting sort is typically implemented
     */
    public static void basicCountingSort(int[] arr, int maxValue) {
        // Our first pass at counting sort - we will change it later; not how one would typically implement this sort.
        int[] counterArray = new int[maxValue + 1];
        // Iterate over arr, and for each val = arr[i], increment counterArray[val].
        for (int i = 0; i < arr.length; i++) {
            int elem =  arr[i];
            counterArray[elem]++;
        }
        // Iterate over the counter array, and use it to sort arr
        int j = 0;
        int k = 0; // index that keeps track of where we are at in the arr
        while (j < counterArray.length) {
            int frequency = counterArray[j];
            for (int l = 0; l < frequency; l++) {
                arr[k] = j;
                k++;
            }
            j++;
        }

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

        // Iterate over elements of arr, and add each element
        // to the linked list of the correct "bin"
        for (i = 0; i < arr.length; i++)
            bins[arr[i].getKey()].add(arr[i]);

        // Iterate over bins, and place elements from each linked
        // list back into arr
        int k = 0;
        for (i = 0; i <= maxValue; i++) {
            LinkedList<Elem> llist = bins[i];
            Iterator<Elem> it = llist.iterator();
            while (it.hasNext()) {
                arr[k] = it.next();
                k++;
            }
        }

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
