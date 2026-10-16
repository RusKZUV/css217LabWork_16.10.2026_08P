package task10_strategy_password;

public class LengthValidator implements ValidationStrategy {
    public boolean isValid(String password) {
        return password.length() >= 8;
    }
}