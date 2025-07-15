package DecoratorPattern.CompositionUsingRealWorldExp;

public class FileAppender implements LogAppender{

    private String filename;

    public FileAppender(String filename){
        this.filename = filename;
    }

    @Override
    public void append(String message){
        System.out.println("writing to : "+filename+": "+message);
    }
}
