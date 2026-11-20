package decorator.SimpleCoffeeExample.v1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee(List.of(new Milk(), new Sugar()));
        System.out.println(coffee.cost());
        System.out.println(coffee.description());
    }
}
