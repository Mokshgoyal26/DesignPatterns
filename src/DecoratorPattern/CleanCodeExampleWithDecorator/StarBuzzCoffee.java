package DecoratorPattern.CleanCodeExampleWithDecorator;

// this is the classic example of DecoratorPattern
// it is using composition , Wrapping the objects at dynamically
// now we can add as many as classes as we want for beverages and condiments without changing the existing code
// this also prevents us from creating class explosion . we can create as many combinations out of it without creating new classes



public class StarBuzzCoffee {
    public static void main(String[] args){

        Beverage beverage =  new Espresso();
        System.out.println(beverage.getDescription()+ " $"+beverage.cost());

        Beverage beverage2 =  new HouseBlend();
        beverage2 = new Mocha(beverage2);
        //beverage2  = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        /*Beverage beverage3 = new DarkRoast();
          beverage3 = new Mocha(beverage3); */

        // we can also do like this
        Beverage beverage3 = new Milk(new Mocha(new DarkRoast()));

        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());

    }
}
