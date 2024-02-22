package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Feb20ExerciseSolution {
        public static void bucketSort(Elem[] arr, int maxKey, int numBuckets) {
            LinkedList<Elem>[] buckets = new LinkedList[numBuckets];

            // Compute the range of each bucket
            int bucketRange = maxKey / numBuckets + 1;

            // Add elements to the buckets
            for (int i = 0; i < arr.length; i++) {
                int key = arr[i].getKey();
                int indexOfBucket = key/bucketRange;
                if (buckets[indexOfBucket] == null) {
                    buckets[indexOfBucket] = new LinkedList<>();
                }
                //LinkedList llist = buckets[indexOfBucket];
                //llist.add(arr[i]);
                buckets[indexOfBucket].add(arr[i]);
            }

            // Put elements back into the array
            int k = 0;
            for (int j = 0; j < numBuckets; j++) {
                LinkedList<Elem> llist = buckets[j];
                if (llist != null) {
                    Collections.sort(llist);

                    Iterator<Elem> it = llist.iterator();
                    while (it.hasNext()) {
                        arr[k] = it.next();
                        k++;
                    }
                }
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


