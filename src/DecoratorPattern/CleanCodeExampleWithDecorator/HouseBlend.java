package DecoratorPattern.CleanCodeExampleWithDecorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost(){
        return 1.21;
    }
}
