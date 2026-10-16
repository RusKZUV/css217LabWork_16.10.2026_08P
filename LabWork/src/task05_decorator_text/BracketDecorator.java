package task05_decorator_text;

public class BracketDecorator extends TextDecorator {
    public BracketDecorator(TextComponent wrapped) {
        super(wrapped);
    }


    public String format(String input) {
        return "[  " + wrapped.format(input) + "]";
    }
}