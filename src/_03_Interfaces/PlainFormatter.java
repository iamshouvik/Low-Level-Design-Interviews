package _03_Interfaces;

public class PlainFormatter implements Formatter{
    @Override
    public String format(String message) {
        return message;
    }
}
