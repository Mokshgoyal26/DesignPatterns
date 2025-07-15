package DecoratorPattern.BadCodeExampleWithoutDecorator;

public class DarkRoastWithMocha extends Beverage{

    @Override
    public String getDiscription(){
        return "dark roast , milk , mocha";
    }

    @Override
    public double cost(){
        return 0.99+0.30+0.70;
    }
}
