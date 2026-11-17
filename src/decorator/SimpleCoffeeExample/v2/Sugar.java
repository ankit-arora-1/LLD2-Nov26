package decorator.SimpleCoffeeExample.v2;

public class Sugar implements Beverage {
    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String description() {
        return "Sugar";
    }
}
