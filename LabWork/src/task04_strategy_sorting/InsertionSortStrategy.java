package task04_strategy_sorting;

public class InsertionSortStrategy implements SortStrategy {
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int bol = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > bol) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = bol;
        }
    }
}