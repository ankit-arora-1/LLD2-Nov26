package decorator.SimpleCoffeeExample.decoratorExample;

public class Sugar implements Beverage {
    private Beverage beverage;
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String description() {
        return beverage.description() + "Sugar";
    }
}
