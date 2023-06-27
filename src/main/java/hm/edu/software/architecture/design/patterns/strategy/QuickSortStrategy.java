package hm.edu.software.architecture.design.patterns.strategy;

public class QuickSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Quick Sort");
    }
}
