package DecoratorPattern.BadCodeExampleWithoutDecorator;

// this is the bad approach
// class Explosion -> every time new types of beverages and new condiments will explode the projects with classes
// Impossible to Maintain -> what if in the future the price of milk , mocha or any condiment goes up then ?
// then you have to change whole the classes prices manually and this clearly breaks the closed for modification
// and open for extensibility principle .
// logic is duplicated in all the classes meaning redundancy in the program.
// violates single responsibility principle -> each class contains logic for both beverage and condiments.
// not scalable

// this is the bad implementation -> we can change it by using decorator pattern .

public class CoffeeShop {

    public static void main(String[] args){

        Beverage order1  = new DarkRoastWithMilk();
        System.out.println(order1.getDiscription() + " $"+order1.cost());

        Beverage order2 = new DarkRoast();
        System.out.println(order2.getDiscription() + " $"+order2.cost());
    }
}
