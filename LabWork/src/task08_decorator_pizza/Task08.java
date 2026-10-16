package task08_decorator_pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Margherita();
        p = new ExtraCheese(p);
        p = new Olives(p);
        p = new Jalapenos(p);

        System.out.println(p.getDetails());
        System.out.println("Price: " + p.getPrice());

        // in this task i found pizza price with toppings: extra cheese, olives, and jalapenos
    }
}