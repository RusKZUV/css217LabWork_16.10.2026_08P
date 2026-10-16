package task08_decorator_pizza;

public abstract class PizzaDecorator implements Pizza {
    protected final Pizza wrapped;

    public PizzaDecorator(Pizza wrapped) {
        this.wrapped = wrapped;
    }
}