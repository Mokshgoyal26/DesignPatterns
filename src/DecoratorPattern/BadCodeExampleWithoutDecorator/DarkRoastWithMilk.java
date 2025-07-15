package DecoratorPattern.BadCodeExampleWithoutDecorator;

public class DarkRoastWithMilk extends Beverage{

    @Override
    public String getDiscription() {
        return "Dark Roast , Milk";
    }

    @Override
    public double cost(){
        return 0.99+0.33;
    }
}
