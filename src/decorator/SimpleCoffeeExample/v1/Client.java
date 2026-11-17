package decorator.SimpleCoffeeExample.v1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Addon> addons = new ArrayList<>();
        addons.add(new Milk());
        addons.add(new Sugar());

        Beverage coffee = new Coffee(addons);
        System.out.println(coffee.cost());
        System.out.println(coffee.description());
    }
}
