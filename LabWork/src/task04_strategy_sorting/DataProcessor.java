package task04_strategy_sorting;

import java.util.Arrays;

public class DataProcessor {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(int[] data) {
        strategy.sort(data);
        System.out.println(Arrays.toString(data));
    }
}