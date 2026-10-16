package task06_adapter_printer;

public class PrinterAdapter implements ModernPrinter {
    private final DotMatrixPrinter legacy;

    public PrinterAdapter(DotMatrixPrinter legacy) {
        this.legacy = legacy;
    }

    public void printDocument(String text) {
        legacy.printCharArray(text.toCharArray());
    }
}