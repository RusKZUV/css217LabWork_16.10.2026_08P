package task01_strategy_discount;

public class PercentageDiscount implements DiscountStrategy {
    public double discount(double price) {
        return price * 0.85;
    }
}