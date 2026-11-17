package decorator.SimpleCoffeeExample.v1;

public class Sugar implements Addon {
    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String description() {
        return "Sugar";
    }
}
