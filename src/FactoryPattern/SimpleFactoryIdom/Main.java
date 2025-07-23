package FactoryPattern.SimpleFactoryIdom;

// we are just basically collecting all the object creation of concrete classes and putting into
// simple factory class which will handle creating objects and make out program clean .
// remember this is not a factory pattern . still this will violate the ocp principle because for every new type of pizza
// we have to change the existing code ./
public class Main {
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
        System.out.println("---");
        store.orderPizza("veggie");
        System.out.println("----");
        store.orderPizza("pineapple");

    }
}
