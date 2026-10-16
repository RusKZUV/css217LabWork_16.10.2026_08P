package task08_decorator_pizza;

public class Jalapenos extends PizzaDecorator {
    public Jalapenos(Pizza wrapped) {
        super(wrapped);
    }

    public String getDetails() {
        return wrapped.getDetails() + " + Jalapenos";
    }


    public int getPrice() {
        return wrapped.getPrice() + 25;
    }
}