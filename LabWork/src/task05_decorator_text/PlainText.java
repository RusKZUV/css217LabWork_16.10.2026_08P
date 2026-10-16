package task05_decorator_text;

public class PlainText implements TextComponent {
    public String format(String input) {
        return input;
    }
}