package decorator.SimpleCoffeeExample.v1;

public class Milk implements Addon {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Milk";
    }
}
