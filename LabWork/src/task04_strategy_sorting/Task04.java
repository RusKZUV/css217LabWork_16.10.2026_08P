package task04_strategy_sorting;

public class Task04 {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();
        int[] data = {0, 2, 9, 21, 51, 6};

        dp.setStrategy(new BubbleSortStrategy());
        dp.process(data.clone());

        dp.setStrategy(new SelectionSortStrategy());
        dp.process(data.clone());

        dp.setStrategy(new InsertionSortStrategy());
        dp.process(data.clone());
        // in this task we found array sorting: bubble, selection, and insertion

    }
}