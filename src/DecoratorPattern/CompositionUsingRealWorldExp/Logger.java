package DecoratorPattern.CompositionUsingRealWorldExp;

public class Logger {

    private LogAppender appender;
    private LogFormatter formatter;

    public Logger(LogAppender appender , LogFormatter formatter){
        this.appender = appender;
        this.formatter = formatter;
    }

    public void log(String level , String message){
        String formattedMessage = formatter.format(level , message);
        appender.append(formattedMessage);
    }
}
