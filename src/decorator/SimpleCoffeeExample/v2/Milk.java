package decorator.SimpleCoffeeExample.v2;

public class Milk implements Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Milk";
    }
}
