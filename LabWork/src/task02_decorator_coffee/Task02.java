package task02_decorator_coffee;

public class Task02 {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        b = new MilkDecorator(b);
        b = new CaramelDecorator(b);
        b = new WhippedCreamDecorator(b);

        System.out.println(b.getDescription());
        System.out.println("Costt: " + b.getCost());
        // in this task i found the coffee cost with add-ons: milk, caramel, whipped cream
    }
}