package decorator.SimpleCoffeeExample.decoratorExample;

public class Discount20 implements Beverage {
    private Beverage beverage;

    public Discount20(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        if(beverage.cost() > 100) {
            return beverage.cost() * 80 / 100;
        }

        return beverage.cost();
    }

    @Override
    public String description() {
        // Check description and if it contains MIlk and Sugar, give discount
        return null;
    }
}
