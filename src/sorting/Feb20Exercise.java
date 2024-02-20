package sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class Feb20Exercise {
        public static void bucketSort(Elem[] arr, int maxKey, int numBuckets) {
            LinkedList[] buckets = new LinkedList[numBuckets];

            // Compute the range of each bucket
            int bucketRange = maxKey / numBuckets + 1;

            // Add elements to the buckets
            for (int i = 0; i < arr.length; i++) {
                // FILL IN CODE
            }

            // Put elements back into the array
            int k = 0;
            for (int j = 0; j < numBuckets; j++) {
                // FILL IN CODE
            }

        }

        public static void main(String[] args) {
            Elem[] records = {
                    new Elem(6, "red"),
                    new Elem(1, "blue"),
                    new Elem(6, "yellow"),
                    new Elem(2, "black"),
                    new Elem(1, "brown"),
                    new Elem(6, "orange"),
                    new Elem(0, "green"),
                    new Elem(6, "gray")};
            bucketSort(records, 6, 3);
            System.out.println(Arrays.toString(records));
        }
}


