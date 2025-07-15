package DecoratorPattern.CompositionUsingRealWorldExp;

// composition is basically defines (has-a) relationship for example car has a engine
// this is the real - world example of using composition in frameworks
// here formatting and appending both are separate , so can evolve independently
// flexible combinations : easily can switch appender or formatters without changing logger or client code
// extensible : add new appender (eg: network appender ) or formatters(eg:json format) without modifying the existing code
// avoid deep inheritance : if we try to do it with inheritance we have to create a lot of classes
// for every combination so here composition helps .
// here objects are created dynamically at run time using composition .
public class App {

    public static void main(String[] args){
        LogAppender consoleAppender = new ConsoleAppender();
        LogFormatter formatter = new SimpleFormatter();

        Logger logger = new Logger(consoleAppender,formatter);

        logger.log("INFO","APPLICATION STARTED");

        // later switched to file appender without changing logger
        LogAppender fileAppender = new FileAppender("app.log");
        logger = new Logger(fileAppender,formatter);
        logger.log("ERROR" , "An error occurred");
    }
}
