package task06_adapter_printer;

public class Main {
    public static void main(String[] args) {
        ModernPrinter p = new PrinterAdapter(new DotMatrixPrinter());
        p.printDocument("My name is Ruslan");

        // in this task i found printing through a legacy dot-matrix printer adapter
    }
}