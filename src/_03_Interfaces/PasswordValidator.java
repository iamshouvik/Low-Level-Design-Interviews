package _03_Interfaces;

public class PasswordValidator implements Validator{

    @Override
    public boolean validate(String input) {
        return input.length()>=8;
    }
}
