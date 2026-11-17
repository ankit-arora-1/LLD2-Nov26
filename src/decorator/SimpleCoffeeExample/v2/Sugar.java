package decorator.SimpleCoffeeExample.v2;

public class Sugar implements Beverage {
    public Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }

    @Override
    public String description() {
        return "Sugar " + beverage.description();
    }
}
