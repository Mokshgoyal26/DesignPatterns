package DecoratorPattern.CleanCodeExampleWithDecorator;


// this is the base class for all the classes .

public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription(){
        return description;
    }


    public abstract double cost();
}
