public class BubbleSort {

    public static void main(String[] args) {
        for (int i : bubbleSort(new int[]{20, 35, -15, 7, 55, 1, -22})) {
            System.out.print(i + " ");
        }
    }

    /**
     *  Bubble sort in action
     *  lupi (lastUnsortedPartitionIndex) - how many times array items will be compared per traversal. array.length - 1
     *  in inner loop i represents unsorted array index elements which will bubble highest array elements to the right
     *  checks if the i element has higher value than i + 1 if true then swaps
     * @param target int array
     * @return sorted int array in ascending order
     */
    public static int[] bubbleSort(int[] target) {
        for (int lupi = target.length - 1; lupi > 0 ; lupi--) {
            for (int i = 0; i < lupi; i++) {
                if (target[i] > target[i + 1]) {
                    swap(target, i, i + 1);
                }
            }
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
