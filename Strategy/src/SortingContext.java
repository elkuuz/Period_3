public class SortingContext {
    private SortingInterface strategy;

    public SortingContext(SortingInterface strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingInterface strategy) {
        this.strategy = strategy;
    }

    public int[] executeSort(int[] input) {
        if (strategy == null) {
            throw new IllegalStateException("Sorting strategy is not set");
        }
        return strategy.sort(input);
    }
}
