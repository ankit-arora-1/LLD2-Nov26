package decorator.SimpleCoffeeExample.v2;

public class Client {
    public static void main(String[] args) {
//        Beverage coffee = new Coffee();
//        Beverage milk = new Milk(coffee);
//        Beverage sugar = new Sugar(milk);

        Beverage coffee = new Sugar(
                new Milk(
                        new Coffee()
                )
        );

        System.out.println(coffee.cost());
        System.out.println(coffee.description());
    }
}
