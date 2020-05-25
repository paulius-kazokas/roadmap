package algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(insertionSort(new int[]{20, 20, -15, 7, 55, 1, -22})));
    }
    
    public static int[] insertionSort(int[] target) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < target.length; firstUnsortedIndex++ ) {
            int newUnsortedElement = taget[firstUnsortedIndex];
            int i;
            // looking for insertion place from right to left (till index 0) and sorted partition element is greater than unsorted element
            for (i = firstUnsortedIndex; i > 0 && target[i - 1] > newUnsortedElement; i --) {
                // shifting higher or equal values to the right of sorted partition on each iteration
                target[i] = target[i - 1];
            }
            target[i] = newUnsortedElement;
        }
    }
    return target;
}
