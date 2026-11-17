package decorator.SimpleCoffeeExample.v2;

public class Coffee implements Beverage {
    @Override
    public int cost() {
        // No for loop anymore. Every feature is equal and a wrapper over another, so each
        // feature deals with its own cost and description
        return 30;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
