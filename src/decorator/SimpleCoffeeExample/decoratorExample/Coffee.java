package decorator.SimpleCoffeeExample.decoratorExample;


// Coffee acts both as a base and a feature that can be wrapped around
// existing beverage
public class Coffee implements Beverage {
    private Beverage beverage;

    public Coffee() {

    }

    public Coffee(Beverage beverage) {
       this.beverage = beverage;
    }
    @Override
    public int cost() {
        if(beverage == null) {
            return 30;
        }

        return beverage.cost() + 30;
    }

    @Override
    public String description() {
        if(beverage == null) {
            return "Coffee";
        }

        return beverage.description() + "Coffee";

    }
}
