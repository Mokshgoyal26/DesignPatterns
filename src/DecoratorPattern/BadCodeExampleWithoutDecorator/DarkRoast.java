package DecoratorPattern.BadCodeExampleWithoutDecorator;

public class DarkRoast extends Beverage{

    @Override
    public String getDiscription(){
        return "Dark Frost";
    }

    @Override
    public double cost(){
        return 0.99;
    }
}
