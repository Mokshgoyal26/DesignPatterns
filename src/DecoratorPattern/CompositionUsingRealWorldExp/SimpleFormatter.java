package DecoratorPattern.CompositionUsingRealWorldExp;

public class SimpleFormatter implements LogFormatter{

    @Override
    public String format(String level , String message){
        return "[" + level + "] "+ message;
    }
}
