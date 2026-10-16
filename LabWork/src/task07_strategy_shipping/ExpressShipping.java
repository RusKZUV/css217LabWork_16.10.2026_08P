package task07_strategy_shipping;

public class ExpressShipping implements ShippingStrategy {

    public double esep(double weightKg, double distanceKm) {
        return weightKg * 5.0 + distanceKm * 1.2 + 50.0;
    }
}