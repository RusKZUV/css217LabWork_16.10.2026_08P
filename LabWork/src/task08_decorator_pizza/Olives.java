package task08_decorator_pizza;

public class Olives extends PizzaDecorator {
    public Olives(Pizza wrapped) {
        super(wrapped);
    }

    public String getDetails() {
        return wrapped.getDetails() + " + Olives";
    }

    public int getPrice() {
        return wrapped.getPrice() + 30;
    }
}