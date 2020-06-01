package algorithms.shellsort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {

    public static int[] shellSort(int[] target) {
        for(int gap = target.length / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < target.length; i++) {
                int newElement = target[i];
                int j = i;
                while(j >= gap && target[j - gap] > newElement) {
                    target[j] = target[j - gap];
                    j -= gap;
                }
                target[j] = newElement;
            }
        }
        return target;
    }
}

