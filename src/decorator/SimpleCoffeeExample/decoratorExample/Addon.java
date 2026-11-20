package decorator.SimpleCoffeeExample.decoratorExample;

public abstract class Addon implements Beverage{
    public abstract int cost();

    @Override
    public String description() {
        return null;
    }
}
