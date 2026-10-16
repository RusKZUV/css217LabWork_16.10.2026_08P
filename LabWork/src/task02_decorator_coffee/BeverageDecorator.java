package task02_decorator_coffee;

public abstract class BeverageDecorator implements Beverage {
    protected final Beverage wrapped;

    public BeverageDecorator(Beverage wrapped) {
        this.wrapped = wrapped;
    }
}