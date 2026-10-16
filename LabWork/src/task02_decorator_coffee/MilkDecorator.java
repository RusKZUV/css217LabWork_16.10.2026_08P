package task02_decorator_coffee;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage wrapped) { super(wrapped); }


    public String getDescription() { return wrapped.getDescription() + ", Milk"; }

    public double getCost() { return wrapped.getCost() + 20.0; }
}