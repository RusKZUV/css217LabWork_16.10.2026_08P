package task05_decorator_text;

public class TrimDecorator extends TextDecorator {
    public TrimDecorator(TextComponent wrapped) {
        super(wrapped);
    }


    public String format(String input) {
        return wrapped.format(input).trim();
    }
}