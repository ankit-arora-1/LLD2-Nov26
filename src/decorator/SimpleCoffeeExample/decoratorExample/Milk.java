package decorator.SimpleCoffeeExample.decoratorExample;

public class Milk implements Beverage {
    private Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String description() {
        return beverage.description() + "Milk";
    }
}
