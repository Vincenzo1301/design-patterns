package hm.edu.software.architecture.design.patterns.strategy;

import java.util.Arrays;

public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        boolean sorted = false;

        while(!sorted) {
            for (int i = 0; i < array.length; i++) {
                if(array[i + 1] < array[i]) {
                    int element1 = array[i + 1];
                    int element2 = array[i];

                    array[i + 1] = element2;
                    array[i] = element1;
                }
            }

            for (int i = 0; i < array.length; i++) {
                sorted = array[i + 1] <= array[i];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
