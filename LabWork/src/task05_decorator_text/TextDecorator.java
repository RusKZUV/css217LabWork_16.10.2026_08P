package task05_decorator_text;

public abstract class TextDecorator implements TextComponent {
    protected final TextComponent wrapped;

    public TextDecorator(TextComponent wrapped) {
        this.wrapped = wrapped;
    }
}