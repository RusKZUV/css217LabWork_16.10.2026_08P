package task07_strategy_shipping;

public class DroneShipping implements ShippingStrategy {
    public double esep(double weightKg, double distanceKm) {
        return weightKg < 5.0 ? 100.0 : -1.0;
    }
}