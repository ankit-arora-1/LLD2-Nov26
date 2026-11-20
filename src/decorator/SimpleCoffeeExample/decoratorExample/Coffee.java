package decorator.SimpleCoffeeExample.decoratorExample;

public class Coffee implements Beverage {
    @Override
    public int cost() {
        return 30;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
