package task01_strategy_discount;

public class FlatDiscount implements DiscountStrategy {

    public double discount(double price) {
        return Math.max(0.0, price - 50.0);
    }
}