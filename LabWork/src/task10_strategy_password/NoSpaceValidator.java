package task10_strategy_password;

public class NoSpaceValidator implements ValidationStrategy {

    public boolean isValid(String password) {
        return !password.contains(" ");
    }
}