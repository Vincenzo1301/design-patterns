package hm.edu.software.architecture.design.patterns.strategy;

public class SortContext {

    private SortingStrategy strategy;

    public SortContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
