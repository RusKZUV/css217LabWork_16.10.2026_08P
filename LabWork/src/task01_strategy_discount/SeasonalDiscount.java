package task01_strategy_discount;

public class SeasonalDiscount implements DiscountStrategy {

    public double discount(double price) {
        if (price > 500.0) {
            return price * 0.75;
        } else {
            return price * 0.95;
        }
    }
}