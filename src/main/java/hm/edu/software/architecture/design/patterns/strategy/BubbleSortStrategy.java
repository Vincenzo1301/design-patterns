package hm.edu.software.architecture.design.patterns.strategy;

import java.util.Arrays;

public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
