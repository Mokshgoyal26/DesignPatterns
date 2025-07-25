package FactoryPattern.SimpleFactoryIdom;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("Veggie")){
            pizza = new VeggiePizza();
        }else if(type.equalsIgnoreCase("clam")){
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
