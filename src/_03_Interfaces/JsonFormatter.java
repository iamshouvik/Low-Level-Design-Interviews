package _03_Interfaces;

public class JsonFormatter implements Formatter{
    @Override
    public String format(String message) {
        return "{\"log\": \"" + message + "\"}";
    }
}
