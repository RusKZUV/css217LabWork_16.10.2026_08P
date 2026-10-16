package task10_strategy_password;

public class DigitValidator implements ValidationStrategy {

    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (c >= '0' && c <= '9') return true;
        }
        return false;
    }
}