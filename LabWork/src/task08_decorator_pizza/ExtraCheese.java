package task08_decorator_pizza;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza wrapped) {
        super(wrapped);
    }


    public String getDetails() {
        return wrapped.getDetails() + " + ExtraCheese";
    }


    public int getPrice() {
        return wrapped.getPrice() + 40;
    }
}