package task08_decorator_pizza;

public class Margherita implements Pizza {
    public String getDetails() {
        return "Margherita";
    }


    public int getPrice() {
        return 200;
    }
}