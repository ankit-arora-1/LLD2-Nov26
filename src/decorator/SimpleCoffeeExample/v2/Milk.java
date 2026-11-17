package decorator.SimpleCoffeeExample.v2;

public class Milk implements Beverage {
    private Beverage beverage;

    public Milk(Beverage beverage) {
       this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 10 + beverage.cost();
    }

    @Override
    public String description() {
        return "Milk " + beverage.description();
    }
}
