package task05_decorator_text;

public class UpperCaseDecorator extends TextDecorator {
    public UpperCaseDecorator(TextComponent wrapped) {
        super(wrapped);
    }


    public String format(String input) {
        return wrapped.format(input).toUpperCase();
    }
}