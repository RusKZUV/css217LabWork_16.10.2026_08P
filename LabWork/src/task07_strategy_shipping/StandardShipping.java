package task07_strategy_shipping;

public class StandardShipping implements ShippingStrategy {
    public double esep(double weightKg, double distanceKm) {
        return weightKg * 2.0 + distanceKm * 0.5;
    }
}