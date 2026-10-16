package task10_strategy_password;

public class Task10 {
    public static void main(String[] args) {
        String pwd = "kaskelennever";

        System.out.println("Length: " + new LengthValidator().isValid(pwd));
        System.out.println("Digit: " + new DigitValidator().isValid(pwd));
        System.out.println("NoSpace: " + new NoSpaceValidator().isValid(pwd));

        // in this task i found password validation: length, digit, and no space
    }
}