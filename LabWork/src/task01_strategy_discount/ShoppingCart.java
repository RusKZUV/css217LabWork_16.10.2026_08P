package task01_strategy_discount;

public class ShoppingCart {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double check(double total) {
        return strategy.discount(total);
    }
}