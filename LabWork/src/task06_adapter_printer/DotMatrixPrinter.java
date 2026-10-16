package task06_adapter_printer;

public class DotMatrixPrinter {
    public void printCharArray(char[] buffer) {
        for (char ch : buffer) {
            System.out.print(ch + " h");
        }
        System.out.println();
    }
}