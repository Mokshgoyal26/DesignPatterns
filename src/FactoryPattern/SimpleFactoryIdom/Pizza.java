package FactoryPattern.SimpleFactoryIdom;

public abstract class Pizza {

    public abstract void prepare();

    public void bake(){
        System.out.println("baking pizza....");
    }

    public void cut(){
        System.out.println("cutting pizza....");
    }

    public void box(){
        System.out.println("boxing pizza....");
    }
}
