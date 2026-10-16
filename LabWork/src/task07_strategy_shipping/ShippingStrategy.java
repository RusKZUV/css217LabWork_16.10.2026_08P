package task07_strategy_shipping;

public interface ShippingStrategy {
    double calculate(double weightKg, double distanceKm);
}