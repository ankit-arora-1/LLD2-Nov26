package decorator.SimpleCoffeeExample.v1;

public class DiscountMilkAndSugar implements Addon {
    @Override
    public int cost(/*int currentCost*/) {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }
}
