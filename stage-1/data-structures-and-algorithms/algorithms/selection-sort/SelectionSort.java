package algorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(selectionSort(new int[]{20, 20, -15, 7, 55, 1, -22})));
    }

    /**
     * Selection Sort in action
     * lui (lastUnsortedIndex) - how many times array items will be compared per traversal. array.length - 1
     * ltiv (largestTraversalIndexValue) - contains largest value compared with unsorted neighbour value
     * 
     * Checks each array element, which element has higher compared value then it's index will be assigned to ltiv.
     * The lui will be swapped with ltiv and lui will be decreased by 1 till it reaches 0.
     * @param target int array
     * @return sorted int array in ascending order
     */
    public static int[] selectionSort(int[] target) {
        for (int lui = target.length - 1; lui > 0 ; lui--) {
            int ltiv = 0;
            for (int i = 1; i <= lui; i ++) {
                if (target[i] > target[ltiv]) {
                    ltiv = i;
                }
            }
            swap(target, ltiv, lui);
        }
        return target;
    }

    /**
     *  Swaps array element i with j if i is greater than j
     *  First, array element of index i is saved as tempI
     *  Second, swap left side (i) array element with neighbour (j)
     *  Finally, assigning tempI value to array element of index j
     * @param array target array with elements
     * @param i present index
     * @param j neighbour index
     */
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int tempI = array[i];
            array[i] = array[j];
            array[j] = tempI;
        }
    }
}
