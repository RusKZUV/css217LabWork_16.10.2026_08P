package task02_decorator_coffee;

public class CaramelDecorator extends BeverageDecorator {
    public CaramelDecorator(Beverage wrapped) { super(wrapped); }


    public String getDescription() { return wrapped.getDescription() + ", Caramel"; }


    public double getCost() { return wrapped.getCost() + 35.0; }
}