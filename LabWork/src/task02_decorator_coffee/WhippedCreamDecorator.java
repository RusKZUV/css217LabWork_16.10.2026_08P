package task02_decorator_coffee;

public class WhippedCreamDecorator extends BeverageDecorator {
    public WhippedCreamDecorator(Beverage wrapped) { super(wrapped); }


    public String getDescription() { return wrapped.getDescription() + "Whipped"; }


    public double getCost() { return wrapped.getCost() + 25.0; }
}