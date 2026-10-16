package task07_strategy_shipping;

public class Task07 {
    public static void main(String[] args) {
        ShippingStrategy s;

        s = new StandardShipping();
        System.out.println("Standard: " + s.calculate(3.0, 10.0));

        s = new ExpressShipping();
        System.out.println("Express: " + s.calculate(3.0, 10.0));

        s = new DroneShipping();
        System.out.println("Drone light: " + s.calculate(3.0, 10.0));
        System.out.println("Drone heavy: " + s.calculate(7.0, 10.0));

        // in this task i found shipping costs: standard, express, and drone
    }
}