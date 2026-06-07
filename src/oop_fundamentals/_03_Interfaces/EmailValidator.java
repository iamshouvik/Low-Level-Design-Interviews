package oop_fundamentals._03_Interfaces;

public class EmailValidator implements Validator{

    @Override
    public boolean validate(String input) {
        return input.contains("@");
    }
}
