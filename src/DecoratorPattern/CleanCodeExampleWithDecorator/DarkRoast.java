package DecoratorPattern.CleanCodeExampleWithDecorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast coffee";

    }

    @Override
    public double cost(){
        return 1.3;
    }
}
