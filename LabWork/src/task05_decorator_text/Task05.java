package task05_decorator_text;

public class Task05 {
    public static void main(String[] args) {
        TextComponent c = new PlainText();
        c = new TrimDecorator(c);
        c = new UpperCaseDecorator(c);
        c = new BracketDecorator(c);

        System.out.println(c.format("   hello kaskelen   "));

        // in this task i found text formatting: trim, uppercase, and brackets
    }
}