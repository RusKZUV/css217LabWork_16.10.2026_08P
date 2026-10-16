package task01_strategy_discount;

public class Task01 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setStrategy(new FlatDiscount());
        System.out.println("Flat : " + cart.check(200.0));

        cart.setStrategy(new PercentageDiscount());
        System.out.println("Percentage : " + cart.check(200.0));

        cart.setStrategy(new SeasonalDiscount());
        System.out.println("Seasonal : " + cart.check(600.0));
        System.out.println("Seasonal : " + cart.check(400.0));
        // // in this task i found discounts: flat, percentage, and seasonal
    }
}