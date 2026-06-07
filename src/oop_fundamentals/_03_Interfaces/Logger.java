package oop_fundamentals._03_Interfaces;

public class Logger {
    private final Formatter formatter;

    public Logger(Formatter formatter){
        this.formatter = formatter;
    }

    public void log(String message){
        System.out.println(this.formatter.format(message));
    }

    public static void main(String[] args) {
        Logger plainLogger = new Logger(new PlainFormatter());
        plainLogger.log("Server started on port 8080");

        Logger jsonLogger = new Logger(new JsonFormatter());
        jsonLogger.log("Server started on port 8080");
    }
}
