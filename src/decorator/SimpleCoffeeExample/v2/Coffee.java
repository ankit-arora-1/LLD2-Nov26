package decorator.SimpleCoffeeExample.v2;

public class Coffee implements Beverage {


    public Coffee() {

    }

    @Override
    public int cost() {
        return 30;
    }

    @Override
    public String description() {
        return "Coffee ";
    }
}
