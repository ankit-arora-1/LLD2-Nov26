package decorator.SimpleCoffeeExample.v2;

public class Coffee implements Beverage {


    public Coffee() {

    }

    @Override
    public int cost() {
        // No for loop anymore. Every feature is equal and a wrapper over another, so each
        // feature deals with its own cost and description + whatever is wrapped over it
        return 30;
    }

    @Override
    public String description() {
        return "Coffee ";
    }
}
