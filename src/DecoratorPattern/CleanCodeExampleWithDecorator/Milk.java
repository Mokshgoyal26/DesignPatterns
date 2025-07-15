package DecoratorPattern.CleanCodeExampleWithDecorator;

public class Milk extends CondimentDecorator{

    Beverage beverage;

    // this is constructor injection
    // injecting the object of beverage
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + " ,Milk";
    }

    @Override
    public double cost(){
        return .5 + beverage.cost();
    }
}
