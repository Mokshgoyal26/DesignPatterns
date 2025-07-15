package DecoratorPattern.CleanCodeExampleWithDecorator;

// why condimentDecorator is abstract class ? -> it is the base class for all condiments so abstract
// why extending the beverage class ? ->  as condiments are also beverage so getting or ensuring the same type

// condiments decorator are having is - a relationship with beverage and also has - a relationship beverage

// milk is a beverage and espresso has a milk

public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();
}
